package HashMap;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        
        // Adding null key and null values
        map.put(null, "Ruby");  // Allowed
        map.put(4, null);       // Allowed

        // Display the HashMap
        System.out.println("HashMap: " + map);

        // Get value using key
        String value = map.get(2); 
        System.out.println("Value at key 2: " + value);

        // Remove an entry using key
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Check if a key exists
        boolean hasKey = map.containsKey(1);
        System.out.println("Does key 1 exist? " + hasKey);
    }
}
 // HashMap is a part of Java Collections Framework that stores data in key-value pairs.
 // It allows one null key and multiple null values and is not synchronized (not thread-safe).
