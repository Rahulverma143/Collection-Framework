package set;

import java.util.TreeSet;

public class TreeSetExample01 {

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
        
        System.out.println(ts);
//      ts.pollFirst(); 
      System.out.println(ts.pollFirst()); // remove first elements
//      System.out.println(ts); 
      ts.pollFirst();System.out.println(ts.pollLast());  // remove last elemenst 
      System.out.println(ts);
       
        // TreeSet automatically stores elements in ascending sorted order.
        // No duplicates allowed, no insertion order followed.
    }
}

/*
→ TreeSet stores elements in sorted order.
→ Duplicate elements are NOT allowed.
→ Null elements are NOT allowed (if TreeSet is non-empty).
→ TreeSet implements NavigableSet, SortedSet, Set, Cloneable, Serializable.
→ It is NOT synchronized (not thread-safe).
→ Uses a Red-Black tree internally.
→ Useful for range-based queries and navigation.

*/