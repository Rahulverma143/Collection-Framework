package map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample02 {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");

        System.out.println(map);
        System.out.println(map.firstKey());   // smallest key  1
        System.out.println(map.lastKey());    // largest key  3 

        System.out.println(map.headMap(3));   // keys < 3 
        System.out.println(map.tailMap(2));   // keys >= 2 
        System.out.println(map.subMap(1, 3)); // keys >=1 and <3 

    }
}
