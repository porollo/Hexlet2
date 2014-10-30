package Numbers.fib;

/**
 * Created by Spider on 07.09.2014.
 */
public class Fib {

    private static final int COUNT = 100;

    private long fibi(long n) {

        if (n == 0)
            return 0;
        else if (n ==1)
            return 1;
        else
            return fibi(n - 1) + fibi(n - 2);
    }

    public void show(){
        for (int i = 0; i < COUNT; i++)
            System.out.println(fibi(i));
    }
}


