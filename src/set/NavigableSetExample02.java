package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample02 {
    public static void main(String[] args) {

        NavigableSet<Integer> ns = new TreeSet<>();

        ns.add(10);
        ns.add(20);
        ns.add(30);
        ns.add(40);

        // Navigation methods
        System.out.println("Lower: " + ns.lower(25));       // element < 25
        System.out.println("Floor: " + ns.floor(20));       // element <= 20
        System.out.println("Ceiling: " + ns.ceiling(25));   // element >= 25
        System.out.println("Higher: " + ns.higher(30));     // element > 30

        System.out.println("------------------------");

        // Poll methods
        System.out.println("Poll First: " + ns.pollFirst()); // removes first element
        System.out.println("Poll Last: " + ns.pollLast());   // removes last element

        // Remaining elements
        System.out.println(ns);
    }
}

/*
====================== NavigableSet Methods Explanation ======================

1) lower(E e)
   → Returns the greatest element strictly LESS than the given element.
   Example: lower(25) → 20

2) floor(E e)
   → Returns the greatest element LESS THAN OR EQUAL to the given element.
   Example: floor(20) → 20

3) ceiling(E e)
   → Returns the smallest element GREATER THAN OR EQUAL to the given element.
   Example: ceiling(25) → 30

4) higher(E e)
   → Returns the smallest element strictly GREATER than the given element.
   Example: higher(30) → 40

5) pollFirst()
   → Removes and returns the FIRST (lowest) element from the set.
   Example: pollFirst() → 10

6) pollLast()
   → Removes and returns the LAST (highest) element from the set.
   Example: pollLast() → 40

7) TreeSet
   → TreeSet is the main implementation of NavigableSet.
   → It stores elements in sorted order.
   → Duplicate and null elements are NOT allowed.

*/
