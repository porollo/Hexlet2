package final_lesson_1;

import java.util.Arrays;

/**
 * Created by Spider on 17.11.2014.
 */

public class Example1 {

    private int[] n3;
    private int m4[];
    private int[] n5[];

    public static void main(String[] args) {
        int[][]array = {{0, 1, 2},{3, 4}};



        /*int[][] array = new int[2][2];*/
        System.out.println(Arrays.deepToString(array));
        System.out.println(array[0].length);
        System.out.println(array[0].getClass().isArray());
        System.out.println(new Example1().getClass().isArray());
        System.out.println(array[1].length);
    }


}
