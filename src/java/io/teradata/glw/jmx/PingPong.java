package io.teradata.glw.jmx;

/**
 * Created by gw186023 on 6/28/17.
 */
public class PingPong extends Thread {
    String word;    // what work to print
    int delay;      // how long to pause
    int count;      // number of iterations

    public PingPong(String what, int delayTime, int number) {
        word = what;
        delay = delayTime;
        count = number;
        setName(what);
    }

    @Override
    public void run() {
        try {
            for (int i=0; i < count; i++) {
                System.out.println(i + ": " + word + ":" + activeCount());
                sleep(delay); // wait until next time
            }
        }
        catch (InterruptedException e) {
            return;     // end this thread
        }
    }
}
