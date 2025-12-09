package com.properties;

// Importing required classes
import java.util.Enumeration;  
// Enumeration: Legacy iterator to go through elements (hasMoreElements(), nextElement())
import java.util.Properties;  
// Properties: A subclass of Hashtable that stores key–value pairs (String → String)

public class PropertiesExample {
    public static void main(String[] args) {

        // Create a Properties object (like a map for storing key–value pairs)
        Properties p = new Properties();

        // Adding key-value pairs (Course Name → Duration)
        p.put("Java", "10-12 Months");     // Key = "Java", Value = "10-12 Months"
        p.put("Python", "8-10 Months");    // Key = "Python", Value = "8-10 Months"
        p.put("Mern", "6-8 Months");       // Key = "Mern", Value = "6-8 Months"
        p.put("C/C++", "5-7 Months");      // Key = "C/C++", Value = "5-7 Months"
        p.put("DSA", "6-7 Months");        // Key = "DSA", Value = "6-7 Months"

        // Printing all properties (unordered because Properties extends Hashtable)
        System.out.println(p);

        System.out.println("----- Enumeration ----------\n");

        // Get an Enumeration object of all VALUES stored in Properties
        // NOTE: elements() → gives only values, not keys
        Enumeration enm = p.elements();

        // First check if element exists → then print it
        System.out.println(enm.hasMoreElements());  // true (because elements exist)
        System.out.println(enm.nextElement());      // prints first value (e.g., "10-12 Months")

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints second value

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints third value

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints fourth value

        System.out.println(enm.hasMoreElements());  // true
        System.out.println(enm.nextElement());      // prints fifth value

        // At this point, Enumeration is exhausted (no elements left)

        // OR - If we still try to fetch another element:
        System.out.println(enm.hasMoreElements());  // false (no more elements left)
        System.out.println(enm.nextElement());      // ❌ Throws java.util.NoSuchElementException
    }
}
