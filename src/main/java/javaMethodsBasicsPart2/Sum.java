package javaMethodsBasicsPart2;

/**
 * Created by Spider on 29.09.2014.
 */
public class Sum {

    public int sum(int a, int b) {
        return a + b;
    }

    public void execute() {
        int a = 12;
        int b = 14;
        this.sum(a, b);
        System.out.println(a);
        a= this.sum(a, b);
        System.out.println(a);
        a= this.sum(sum(a,b), b);
        System.out.println(a);



    }



}
