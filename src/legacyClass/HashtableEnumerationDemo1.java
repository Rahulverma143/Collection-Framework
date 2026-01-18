package legacyClass;

import java.util.*;

public class HashtableEnumerationDemo1 {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("A", "Apple");
        ht.put("B", "Banana");
        ht.put("C", "Cherry");

        // Get Enumeration of keys
        Enumeration<String> keys = ht.keys();
        System.out.println("Key = Value pairs:");
        while(keys.hasMoreElements()) {
            String key = keys.nextElement();       // get key
            String value = ht.get(key);           // get value by key
            System.out.println(key + " = " + value);
        }
    }
}
