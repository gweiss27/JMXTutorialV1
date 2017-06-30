package io.teradata.glw.jmx;

/**
 * Created by gw186023 on 6/28/17.
 */
public class Hello implements HelloMBean {
    private String message = null;

    public Hello() {
        message = "Hello, World!";
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayHello() {
        System.out.println(message);
    }
}
