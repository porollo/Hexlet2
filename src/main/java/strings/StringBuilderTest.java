package strings;

/**
 * Created by Spider on 18.11.2014.
 */

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello")
          .append(" ");

        sb.append("World")
          .append(" ")
          .append("!!!");

        //sb.reverse();
        //sb.deleteCharAt(1);


        System.out.println(sb);
        System.out.println(sb.length());

    }

}
