package final_lesson_1;

/**
 * Created by Spider on 17.11.2014.
 */

public class Example4 {

    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(generateInt(100));
    }

    private static int generateInt (int max){
        return (int)(Math.random() * max);
    }

}
