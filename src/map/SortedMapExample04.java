package map;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;

public class SortedMapExample04 {

    public static void main(String[] args) {

        // Creating SortedMap (TreeMap)
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");
        map.put(5, "React");
        map.put(4, "Spring");

        System.out.println("SortedMap: " + map);

        // 1️ Iteration using entrySet() (BEST PRACTICE)
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 2️ Iteration using forEach() (Java 8+)
        System.out.println("\nUsing forEach():");
        map.forEach((key, value) ->
            System.out.println(key + " -> " + value)
        );

        // 3️ Iteration using keySet()
        System.out.println("\nUsing keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 4️ Iteration using Iterator (Interview Important)
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
