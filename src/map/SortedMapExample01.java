package map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample01 {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");

        System.out.println(map);
    }
}


// SortedMap is an interface in Java 
// It  stores key–value pairs in sorted order of keys.
// Keys are automatically sorted
// Sorting is ascending order by default
// Does NOT allow null key (TreeMap)
// Values can be null