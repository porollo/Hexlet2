package java2.lesson2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Spider on 21.12.2014.
 */

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        for (int number : numbers) {
            System.out.println(number);
        }


        numbers.forEach((Integer value) -> System.out.println(value));

        numbers.forEach(System.out::println);

    }



}
