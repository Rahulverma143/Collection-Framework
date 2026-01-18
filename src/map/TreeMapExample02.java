package map;
import java.util.TreeMap;

public class TreeMapExample02 {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(10, "Java");
        map.put(20, "Python");
        map.put(30, "C++");
        map.put(40, "Spring");

        System.out.println(map);

        System.out.println("\nMethods of TreeMap------");
        System.out.println("lowerKey(30): " + map.lowerKey(30));
        System.out.println("floorKey(30): " + map.floorKey(30));
        System.out.println("ceilingKey(30): " + map.ceilingKey(30));
        System.out.println("higherKey(30): " + map.higherKey(30));

        System.out.println("\n----------------------");
        System.out.println("headMap(30): " + map.headMap(30));
        System.out.println("tailMap(20): " + map.tailMap(20));
        System.out.println("subMap(20, 40): " + map.subMap(20, 40));

        System.out.println("\nDescending Order TreeMap---------");
        System.out.println("Ascending: " + map);
        System.out.println("Descending: " + map.descendingMap());

        System.out.println("\nRemove First & Last Entry-------------");
        System.out.println("pollFirstEntry(): " + map.pollFirstEntry());
        System.out.println("pollLastEntry(): " + map.pollLastEntry());
        System.out.println("After removal: " + map);

        //  Definitions printed at the end
        System.out.println("\nTreeMap Method Definitions============");
        System.out.println("lowerKey(k)    : Returns greatest key strictly LESS than k");
        System.out.println("floorKey(k)    : Returns greatest key LESS THAN or EQUAL to k");
        System.out.println("ceilingKey(k)  : Returns smallest key GREATER THAN or EQUAL to k");
        System.out.println("higherKey(k)   : Returns smallest key strictly GREATER than k");
        System.out.println("headMap(k)     : Returns keys LESS than k");
        System.out.println("tailMap(k)     : Returns keys GREATER THAN or EQUAL to k");
        System.out.println("subMap(a,b)    : Returns keys BETWEEN a (inclusive) and b (exclusive)");
        System.out.println("descendingMap(): Returns map in REVERSE (descending) order");
        System.out.println("pollFirstEntry(): Removes & returns FIRST (smallest) entry");
        System.out.println("pollLastEntry(): Removes & returns LAST (largest) entry");
    }
}
