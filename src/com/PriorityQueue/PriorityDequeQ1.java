package com.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityDequeQ1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue();
            
        p.add(50);
        p.add(40);
        p.add(80);
        p.add(50);
        p.add(10);
        System.out.println(p);   // print heap (not sorted, smallest element = 10 at head)

        p.add(880);
        p.add(800);
        System.out.println(p);   // heap with 7 elements, head still 10

        System.out.println(p.poll()); // removes and prints the head (10)

        System.out.println(p);   // 10 is removed, now 40 is head

        System.out.println(p.peek()); // just shows head (40) without removing
        System.out.println("PriorityQueue:" + p);   // still same queue
    }
}
