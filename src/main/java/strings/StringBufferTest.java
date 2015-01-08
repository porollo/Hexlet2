package strings;

/**
 * Created by Spider on 18.11.2014.
 */

public class StringBufferTest {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        sb.append("Hello")
                .append(" ");
        sb.append("World");

        System.out.println(sb);
        System.out.println(sb.length());

    }
}
