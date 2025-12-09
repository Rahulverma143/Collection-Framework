package com.TreeSet;
import java.util.TreeSet;
public class TreeSetQ1 {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> ts = new TreeSet<>();
        // Add elements
        ts.add(71);
        ts.add(18);
        ts.add(84);
        ts.add(97);
        ts.add(38);
        ts.add(77);
        System.out.println(ts);
        // Remove smallest element
        ts.pollFirst();
        // Add more elements
        ts.add(65);
        ts.add(21);
        ts.add(49);
        // Remove largest element
        ts.pollLast();
        // Add more elements, duplicates will be ignored
        ts.add(75);
        ts.add(38); // duplicate, ignored
        ts.add(71); // duplicate, ignored
        ts.add(88);
        // Print the TreeSet
        System.out.println(ts);            // Sorted order
        System.out.println(ts.hashCode()); // Hash code
        System.out.println(ts.toString()); // String representation
        System.out.println(ts.getClass()); // Runtime class
    }
}
