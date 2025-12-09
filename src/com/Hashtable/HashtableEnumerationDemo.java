package com.Hashtable;
import java.util.*;

public class HashtableEnumerationDemo {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("A", "Apple");
        ht.put("B", "Banana");
        ht.put("C", "Cherry");

        // Get Enumeration of keys
        Enumeration<String> keys = ht.keys();
        System.out.println("Keys:");
        while(keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // Get Enumeration of values
        Enumeration<String> values = ht.elements();
        System.out.println("\nValues:");
        while(values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
    }
}
