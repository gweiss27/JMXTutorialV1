package io.teradata.glw.jmx.service;

import io.teradata.glw.jmx.Hello;
import io.teradata.glw.jmx.PingPong;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by gw186023 on 6/28/17.
 */
public class SimpleAgent {

    private MBeanServer mbs = null;

    public SimpleAgent() {

        // Get the platform MBeanServer
        mbs = ManagementFactory.getPlatformMBeanServer();

        // Unique identification of MBeans
        Hello helloBean = new Hello();
        helloBean.setMessage("HELLO - HELLO - HELLO");
        ObjectName helloName = null;

        try {
            // Uniquely identify the MBeans and register them with the platform MBeanServer
//            helloName = new ObjectName("FOO:name=HelloBean");
            helloName = new ObjectName("SimpleAgent:name=SwingHelloThere");
            mbs.registerMBean(helloBean, helloName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Utility method: so that the application continues to run
    private static void waitForEnterPressed() {
        try {
            System.out.println("Press  to continue...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SimpleAgent agent = new SimpleAgent();
        System.out.println("SimpleAgent is running...");
        new PingPong("ping",    200, 1000).start();
        new PingPong("  pong", 5000, 500).start();
        new PingPong(" ding", 4000, 500).start();
        new PingPong("    dong", 3000, 500).start();
        new PingPong("PONG", 2800, 500).start();

//        SimpleAgent.waitForEnterPressed();
    }
}
