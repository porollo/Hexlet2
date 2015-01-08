package final_lesson_1;

/**
 * Created by Spider on 17.11.2014.
 */

public class Example11 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
/*        for (int i = 0; i < 100; i++) {
            sb.append(i + " ");
        }*/

        String test = "test";
        sb.append(test);


        System.out.println(sb.toString().equals(test));


    }


}
