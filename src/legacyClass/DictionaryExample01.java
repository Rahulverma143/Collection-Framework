package legacyClass;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class DictionaryExample01 {
    public static void main(String[] args) {

        Dictionary<Integer, String> d = new Hashtable<>();

        d.put(1, "Java");
        d.put(2, "Python");
        d.put(3, "Spring");

        System.out.println("Size: " + d.size());

        Enumeration<Integer> keys = d.keys();

        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println(key + " = " + d.get(key));
        }
    }
}

/*
Dictionary is an abstract class present in java.util
It represents a key–value pair data structure
It is a legacy class (old)
You cannot create an object of Dictionary directly because it is abstract.
Does not allow null key or null value
→ Enumeration is used for traversal
→ Replaced by Map interface
*/