package com.Hashtable;
import java.util.*;

public class HashtableExample1 {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        
        // Add elements
        ht.put("A", "Apple");
        ht.put("B", "Banana");
        
        // Get value
        System.out.println(ht.get("A"));  // Apple
        
        // Check key
        System.out.println(ht.containsKey("B")); // true
        
        // Enumeration of keys
        Enumeration<String> keys = ht.keys();
        while(keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }
    }
}
