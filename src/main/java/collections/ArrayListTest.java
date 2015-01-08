package collections;

import java.util.ArrayList;

/**
 * Created by Spider on 18.11.2014.
 */

public class ArrayListTest {


    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        for (int i=0; i < 100; i++){
            list.add(i);
        }

        list.add(5, 1);

        System.out.println(list);
        System.out.println(list.size());

        list.remove(10);

        System.out.println(list);
        System.out.println(list.size());
        list.trimToSize();
        System.out.println("After trim - " + list.size());
    }

}
