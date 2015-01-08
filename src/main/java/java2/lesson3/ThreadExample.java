package java2.lesson3;

/**
 * Created by Spider on 27.11.2014.
 */

public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
       ThreadShower1 t = new ThreadShower1();
        t.start();
        Thread.sleep(3000);
        t.stopShow();

    }
}
