package map;


import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class NavigableMapExample03 {

    public static void main(String[] args) {

        // Creating NavigableMap
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "C++");
        map.put(40, "Spring");
        map.put(50, "React");

        System.out.println("NavigableMap: " + map);

        // Navigation methods
        System.out.println("lowerKey(30): " + map.lowerKey(30));
        System.out.println("floorKey(30): " + map.floorKey(30));
        System.out.println("ceilingKey(30): " + map.ceilingKey(30));
        System.out.println("higherKey(30): " + map.higherKey(30));

        System.out.println("firstKey(): " + map.firstKey());
        System.out.println("lastKey(): " + map.lastKey());

        // Descending order
        System.out.println("Descending Map: " + map.descendingMap());

        // Poll entries
        System.out.println("pollFirstEntry(): " + map.pollFirstEntry());
        System.out.println("pollLastEntry(): " + map.pollLastEntry());

        System.out.println("After polling: " + map);

        // Iteration
        System.out.println("\nIterating NavigableMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
