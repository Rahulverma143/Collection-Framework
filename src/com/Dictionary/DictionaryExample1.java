package com.Dictionary;


import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryExample1 {

    public static void main(String[] args) {
        // Create a Dictionary object (Hashtable is concrete subclass)
        Dictionary<String, String> dict = new Hashtable<>();

        // Add key-value pairs (Course → Duration)
        dict.put("Java", "10-12 Months");
        dict.put("Python", "8-10 Months");
        dict.put("Mern", "6-8 Months");
        dict.put("C/C++", "5-7 Months");
        dict.put("DSA", "6-7 Months");
        // Print the Dictionary object (unordered)
        System.out.println(dict);
        System.out.println("------------\n");
        // Get Enumeration of keys
        Enumeration<String> keys = dict.keys(); // keys() → returns keys as Enumeration

        // Iterate safely over all keys using while loop
        while(keys.hasMoreElements()) {
            String key = keys.nextElement();       // nextElement() → fetch next key
            String value = dict.get(key);          // get(key) → fetch the corresponding value
            System.out.println(key + "  " + value); // Print key and value together
        }
    }
}
