package legacyClass;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class DictionaryAllMethods {
    public static void main(String[] args) {

        // Dictionary object (using Hashtable because Dictionary is abstract)
        Dictionary<Integer, String> d = new Hashtable<>();

        // 1. put(key, value)
        d.put(1, "Java");
        d.put(2, "Python");
        d.put(3, "Spring");

        // 2. size()
        System.out.println("Size: " + d.size());

        // 3. isEmpty()
        System.out.println("Is Empty: " + d.isEmpty());

        // 4. get(key)
        System.out.println("Get key 2: " + d.get(2));

        // 5. keys() - Enumeration of keys
        System.out.println("\nKeys:");
        Enumeration<Integer> keys = d.keys();
        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // 6. elements() - Enumeration of values
        System.out.println("\nValues:");
        Enumeration<String> values = d.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

        // 7. remove(key)
        d.remove(3);
        System.out.println("\nAfter removing key 3:");

        Enumeration<Integer> k2 = d.keys();
        while (k2.hasMoreElements()) {
            Integer key = k2.nextElement();
            System.out.println(key + " = " + d.get(key));
        }
    }
}
