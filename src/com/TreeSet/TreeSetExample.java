package com.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer>ts = new TreeSet<Integer>();  
        // Creates an empty TreeSet (stores unique elements in sorted order)

        ts.add(5);    
        ts.add(50);   
        ts.add(20);    
        ts.add(58);    
        ts.add(94);    
        ts.add(125);   
        ts.add(100);   
        ts.add(10);    

        System.out.println(ts);
       
        // TreeSet automatically stores elements in ascending sorted order.
        // No duplicates allowed, no insertion order followed.
    }
}
