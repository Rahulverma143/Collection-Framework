package set;

import java.util.HashSet;

public class HashSetExample01 {
	
	    public static void main(String[] args) {

	        HashSet<Integer> hs = new HashSet<>();

	        hs.add(10);
	        hs.add(20);
	        hs.add(30);
	        hs.add(20);   // duplicate

	        System.out.println(hs);
	    }
	}
/*
→ HashSet implements Set interface.
→ HashSet does NOT maintain insertion order.
→ Duplicate elements are NOT allowed.
→ Only one null element is allowed.
→ HashSet is NOT synchronized (not thread-safe).
→ HashSet provides fast performance for add, remove, and search.
→ HashSet allows heterogeneous elements (without generics).
-> Internal working of HashSet
-> HashSet vs LinkedHashSet vs TreeSet
*/