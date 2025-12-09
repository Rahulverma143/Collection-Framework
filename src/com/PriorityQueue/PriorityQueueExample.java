package com.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue <Integer> ();  
        // Creates a PriorityQueue (default Min-Heap)

          
        pq.add(50);   
        pq.add(100); 
        pq.add(10);
        pq.add(54);   
        pq.add(12);   
        pq.add(74);
      // Add an element using offer() (like add()) 
        pq.offer(20); 
        
      // Note: The output is NOT fully sorted. 
      //  Only the head (smallest element) is guaranteed to be first
        System.out.println(pq);
        // Example Output: [10, 12, 500, 54, 50, 74]
        // Note: It does NOT print sorted order.
        // Internally it is a heap:- only head (smallest = 10) is guaranteed to be first.
    }
}
