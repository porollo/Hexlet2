package Numbers.fib;

import java.util.Date;

/**
 * Created by Spider on 24.10.2014.
 */

public class Main {

    public static void main(String[] args) {

        Fib fib = new Fib();

        int start;
        int finish;
        int res;

        start = (int) System.currentTimeMillis();

        System.out.println("Started at " + start);
        fib.show();

        finish = (int) System.currentTimeMillis();
        System.out.println("Finished at " +finish);

        res = finish - start;
        System.out.println("Time is " + res/1000 + " sec.");
    }
}
