package final_lesson_1;

/**
 * Created by Spider on 17.11.2014.
 */

public class Example6 {
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        Integer c = 25;
        Integer d = 25;
        Integer e = new Integer(c);

        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println("------------");
// -128 127
        System.out.println((c==d));
        System.out.println((c.equals(d)));
        System.out.println("------------");
        System.out.println((c==e));
        System.out.println((c.equals(e)));
        System.out.println("------------");
        String test1 = "test";
        String test2 = "test";

        System.out.println((test1==test2));
        System.out.println((test1.equals(test2)));
    }
}
