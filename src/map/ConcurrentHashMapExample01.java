package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample01 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Accessing elements
        System.out.println("Value for key 2: " + map.get(2));

        // Printing whole map
        System.out.println("Map: " + map);

        // ------------------------------
        // Definition & Key Points
        // ------------------------------

        /*
          ConcurrentHashMap:
          A thread-safe implementation of the Map interface in Java.
          Allows multiple threads to read and write concurrently without
          throwing ConcurrentModificationException.
         
          Key Points:
          1. Thread-safe: Multiple threads can access and modify without explicit synchronization.
          2. High performance: Uses internal segments or locks for concurrent updates.
          3. Null not allowed: Neither keys nor values can be null.
          4. Methods: put, get, remove, replace, putIfAbsent, compute, merge, forEach, etc.
          5. Iterators are weakly consistent: Can iterate while map is being modified.
          6. Useful in multi-threaded applications where HashMap fails due to concurrency.
         */
    }
}
