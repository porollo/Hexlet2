package X0;

/**
 * Created by Spider on 03.02.2015.
 */
public class A {

    public static int a = 13;
    public int b = 13;


    public static void main(String[] args) {

        final A a1 = new A();
        final A a2 = new A();

        A.a = -13;
        a2.b = -13;

        System.out.println(a1.b);
        System.out.println(A.a);


    }


}
