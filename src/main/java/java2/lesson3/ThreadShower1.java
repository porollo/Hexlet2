package java2.lesson3;

/**
 * Created by Spider on 27.11.2014.
 */

public class ThreadShower1 extends Thread {

    private boolean running = true;

    @Override
    public void run() {
        while (running)
            System.out.println("HELLO THREAD!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
    }

    public void stopShow() {
        running = false;
    }
}
