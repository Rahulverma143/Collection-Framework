package com.Iterator;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
    	
        // Create a Vector (legacy class)
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        vector.add("Grapes");

        // Get Enumeration for the vector
        Enumeration<String> e = vector.elements();

        // Iterate elements using Enumeration
        System.out.println("Fruits in the vector:");
        while (e.hasMoreElements()) {
            String fruit = e.nextElement();
            System.out.println(fruit);
        }
    }
}
