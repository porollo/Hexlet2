package collections;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by Spider on 18.11.2014.
 */

public class LinkedListTest {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        for (int i = 0; i <10; i++) {
            list.add(i);
        }

        list.addFirst(10);
        list.addLast(11);
        list.add(5, 246);

        System.out.println(list);

    }



}
