package Hashtable;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> h = new Hashtable<>();

        // Adding elements
        h.put(1, "Java");
        h.put(2, "Python");
        h.put(3, "C++");

        // Printing the Hashtable
        System.out.println("Hashtable: " + h);

        // Trying to add null key or value (Uncommenting these lines will throw NullPointerException)
        // h.put(null, "Ruby");  // ❌ Null key not allowed
        // h.put(4, null);       // ❌ Null value not allowed
    }
}

/* Hashtable:
    Part of Java's legacy collection framework.
    Stores data in key-value pairs, where each key is unique.
    Null keys and null values are not allowed.
    It is synchronized, meaning it is thread-safe.
    Does not maintain insertion order.
*/
