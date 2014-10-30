package Numbers.fib2;


/**
 * Created by Spider on 24.10.2014.
 */

public class Main {

    public static void main(String[] args) {






        int start;
        int finish;
        int res;

        start = (int) System.currentTimeMillis();
        System.out.println("Started at " + start);


        Fib fibonacci = new Fib();
/*
        fib.showOld();

        finish = (int) System.currentTimeMillis();
        System.out.println("Finished at " +finish);

        res = finish - start;
        System.out.println("Time is " + res/1000 + " sec.");

*/

        start = (int) System.currentTimeMillis();
        fibonacci.showFibi();
        finish = (int) System.currentTimeMillis();
        System.out.println("Finished at " +finish);

        res = finish - start;
        System.out.println("Time is " + res/1000 + " sec.");






    }

}
