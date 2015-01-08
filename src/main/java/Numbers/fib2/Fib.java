package Numbers.fib2;

import java.math.*;

/**
 * Created by Spider on 24.10.2014.
 */

public class Fib {


    private final static int COUNT = 100;

    BigInteger x = BigInteger.valueOf(1);
    BigInteger y = BigInteger.valueOf(1);
    BigInteger z = BigInteger.valueOf(2);
    BigInteger n = BigInteger.valueOf(0);
    BigInteger ans = BigInteger.valueOf(1);


/*
    private static final int COUNT = 100;
    private long x = 1;
    private long y = 1;
    private long ans ;

    private long fibiOld(long n) {

        if (n <=2)
            return 1;
        for (int i = 2; i < n; i++)
        {
            ans = x + y;
            x = y;
            y = ans;
        }
        return ans;
    }

    public void showOld() {
        for(int i =0; i < COUNT; i++)
            System.out.println(fibiOld(3));
    }
*/

    private BigInteger fibonacci(BigInteger ans) {

        int res1;
        res1 = ans.compareTo(BigInteger.valueOf(2));

        if (res1 >= 0)
            return BigInteger.valueOf(1);








        /*
        for (){

        }
        ans = BigInteger.valueOf(res); last comment
*/

/*
        if ( ans <= res
            return BigInteger.valueOf(1); //return 1;

        for (int i =2; i < ans; i++)
        {
            BigInteger ans = x.add(y); // ans = x+y;
            BigInteger x = y; //x = y;
            BigInteger y = ans; //y= ans;
        }*/

        return ans;

    }

    public void showFibi() {
        for(int i =0; i < COUNT; i++)
            System.out.println(fibonacci(ans));
    }



}





