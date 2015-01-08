package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Spider on 18.11.2014.
 */

public class HashMapTest {


    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();

        hm.put("Dima",  new Integer(5));
        hm.put("Max",   new Integer(8));
        hm.put("Vasya", new Integer(12+3));
        hm.put("Alex",  new Integer(5));

        Set<Map.Entry<String, Integer>> set = hm.entrySet();

        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        int value = hm.get("Dima");
        hm.put("Dima", value + 3);
        System.out.println("Dima has " + hm.get("Dima"));
    }
}
