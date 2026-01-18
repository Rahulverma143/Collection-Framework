package map;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class NavigableMapExample02 {

    public static void main(String[] args) {

        // Creating NavigableMap
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "C++");
        map.put(40, "Spring");
        map.put(50, "React");

        System.out.println("NavigableMap (TreeMap): " + map);
        System.out.println("These are NavigableSet methods, not NavigableMap methods.");
        System.out.println("\n--- Navigation Methods ---");
        System.out.println("ceilingKey(25): " + map.ceilingKey(25)); // ≥ key
        System.out.println("higherKey(30): " + map.higherKey(30));   // > key
        System.out.println("floorKey(25): " + map.floorKey(25));     // ≤ key
        System.out.println("lowerKey(20): " + map.lowerKey(20));     // < key

        System.out.println("\n--- Range Methods ---");
        System.out.println("tailMap(30): " + map.tailMap(30)); // keys ≥ 30
        System.out.println("tailMap(30, false): " + map.tailMap(30, false)); // keys > 30
        System.out.println("headMap(30): " + map.headMap(30)); // keys < 30
        System.out.println("headMap(30, true): " + map.headMap(30, true)); // keys ≤ 30
        System.out.println("subMap(20, 40): " + map.subMap(20, 40)); // keys ≥ 20 and < 40
        System.out.println("subMap(20, true, 40, true): " + map.subMap(20, true, 40, true)); // inclusive

        System.out.println("\n--- Descending Map ---");
        System.out.println("Descending Map: " + map.descendingMap());

        System.out.println("\n--- Poll Methods (remove first/last entry) ---");
        System.out.println("pollFirstEntry(): " + map.pollFirstEntry());
        System.out.println("pollLastEntry(): " + map.pollLastEntry());
        System.out.println("After polling: " + map);

        System.out.println("\n--- Iteration ---");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 🔹 Method Definitions
        System.out.println("\n--- Method Definitions ---");
        System.out.println("ceilingKey(k)     : Returns smallest key ≥ k");
        System.out.println("higherKey(k)      : Returns smallest key > k");
        System.out.println("floorKey(k)       : Returns largest key ≤ k");
        System.out.println("lowerKey(k)       : Returns largest key < k");
        System.out.println("tailMap(k)        : Returns keys ≥ k");
        System.out.println("tailMap(k, inclusive) : Returns keys ≥ or > k based on boolean");
        System.out.println("headMap(k)        : Returns keys < k");
        System.out.println("headMap(k, inclusive) : Returns keys ≤ or < k based on boolean");
        System.out.println("subMap(from, to)  : Returns keys from ≥ from and < to");
        System.out.println("subMap(from, fInc, to, tInc) : Returns keys with inclusivity flags");
        System.out.println("descendingMap()   : Returns map in reverse order");
        System.out.println("pollFirstEntry()  : Removes and returns first entry");
        System.out.println("pollLastEntry()   : Removes and returns last entry");
    }
}
