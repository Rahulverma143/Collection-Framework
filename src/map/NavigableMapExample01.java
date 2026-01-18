package map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample01 {

    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");

        System.out.println("Map: " + map);

        System.out.println("lowerKey(2): " + map.lowerKey(2));
        System.out.println("floorKey(2): " + map.floorKey(2));
        System.out.println("ceilingKey(2): " + map.ceilingKey(2));
        System.out.println("higherKey(2): " + map.higherKey(2));
    }
}

/*
NavigableMap is a child interface of SortedMap
It stores key-value pairs in sorted order and provides methods to navigate 
through keys (before, after, or equal to a given key).
 */