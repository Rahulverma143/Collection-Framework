package map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample04 {

    public static void main(String[] args) {

        // Creating Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C++");
        table.put(4, "Spring");

        System.out.println("Hashtable: " + table);

        System.out.println("\n--- Methods of Hashtable ---");

        // Size
        System.out.println("Size: " + table.size());

        // Get value by key
        System.out.println("Value for key 2: " + table.get(2));

        // Check if key exists
        System.out.println("Contains key 3? " + table.containsKey(3));

        // Check if value exists
        System.out.println("Contains value 'Python'? " + table.containsValue("Python"));

        // Remove a key-value pair
        table.remove(4);
        System.out.println("After remove(4): " + table);

        // Replace value for a key
        table.replace(2, "JavaScript");
        System.out.println("After replace(2): " + table);

        // Iterating using entrySet()
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iterating using forEach()
        System.out.println("\nIterating using forEach():");
        table.forEach((k, v) -> System.out.println(k + " -> " + v));

        // Clear all entries
        table.clear();
        System.out.println("\nAfter clear(): " + table);

        // 🔹 Method Definitions (Explanation)
        System.out.println("\n--- Hashtable Method Definitions ---");
        System.out.println("put(k,v)         : Inserts key-value pair into Hashtable");
        System.out.println("get(k)           : Returns value associated with key k");
        System.out.println("containsKey(k)   : Checks if key exists");
        System.out.println("containsValue(v) : Checks if value exists");
        System.out.println("remove(k)        : Removes key-value pair for key k");
        System.out.println("replace(k,v)     : Updates value for key k");
        System.out.println("size()           : Returns number of entries");
        System.out.println("entrySet()       : Returns set of key-value pairs for iteration");
        System.out.println("forEach()        : Iterates all entries using lambda expression");
        System.out.println("clear()          : Removes all entries from Hashtable");
    }
}
