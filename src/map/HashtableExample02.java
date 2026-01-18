package map;
import java.util.Hashtable;

public class HashtableExample02 {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C++");

        // Size of Hashtable
        System.out.println("Size: " + table.size());

        // Check if key exists
        System.out.println("Contains key 2 " + table.containsKey(2));

        // Check if value exists
        System.out.println("Contains value 'Python'? " + table.containsValue("Python"));

        // Get value by key
        System.out.println("Value for key 1: " + table.get(1));

        // Remove a key-value pair
        table.remove(3);
        System.out.println("After remove(3): " + table);

        // Replace value for a key
        table.replace(2, "JavaScript");
        System.out.println("After replace(2): " + table);

        // Clear all entries
        table.clear();
        System.out.println("After clear(): " + table);
    }
}
