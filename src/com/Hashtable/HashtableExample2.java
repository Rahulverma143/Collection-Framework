package com.Hashtable;

import java.util.Hashtable;

public class HashtableExample2 {
    public static void main(String[] args) {
        
        Hashtable<Integer, Integer> h1 = new Hashtable<>();
        h1.put(1, 10);
        h1.put(2, 20);
        h1.put(3, 200);

        // Print all elements in one line
        
        System.out.println("All elements: " + h1);
        
    }
}
