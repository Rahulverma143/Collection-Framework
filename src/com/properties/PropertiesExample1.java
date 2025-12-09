package com.properties;

// Importing required classes
import java.util.Enumeration;   
// Enumeration → Legacy iterator with hasMoreElements() & nextElement()
import java.util.Properties;  
// Properties → Subclass of Hashtable, stores key-value pairs (String → String)

public class PropertiesExample1 {

    public static void main(String[] args) {
        
        // Create a Properties object
        Properties p = new Properties();
        
        // Add key–value pairs (Course → Duration)
        p.put("Java", "10-12 Months");     
        p.put("Python", "8-10 Months");    
        p.put("Mern", "6-8 Months");       
        p.put("C/C++", "5-7 Months");      
        p.put("DSA", "6-7 Months");        

        // Print all key-value pairs (unordered because Properties extends Hashtable)
        System.out.println(p);

        System.out.println("--------------\n");

        // Get Enumeration of all KEYS (not values!)
        // propertyNames() → returns all the keys (like "Java", "Python", etc.)
        Enumeration enm = p.propertyNames();

        // Now we are iterating over KEYS, not values
        // First check if more keys exist → then fetch the key
        System.out.println(enm.hasMoreElements());  // true (keys exist)
        System.out.println(enm.nextElement());      // prints one key (e.g., "DSA")

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints next key (e.g., "Mern")

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints next key (e.g., "Java")

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints next key (e.g., "C/C++")

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints last key (e.g., "Python")

        // After this point, no keys are left → enm.hasMoreElements() would return false
        // If we still call nextElement() → it will throw java.util.NoSuchElementException
    }
}
