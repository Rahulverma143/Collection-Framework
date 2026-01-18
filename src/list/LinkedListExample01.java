package list;

import java.util.LinkedList;

public class LinkedListExample01 {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);

		System.out.println(ll);
	}
}

/*
 * LinkedList is a class present in the java.util package.
 * 
 * It implements List and Deque interfaces.
 * 
 * LinkedList stores elements using a Doubly Linked List data structure.
 * 
 * Implements List: → Maintains insertion order → Allows duplicate elements →
 * Allows multiple null values
 * 
 * Doubly Linked List Structure: Each node contains: → Data → Reference to
 * previous node → Reference to next node
 * 
 * No index-based internal storage like ArrayList.
 * 
 * Dynamic Size: → Size increases or decreases automatically. → No capacity
 * concept.
 * 
 * Insertion & Deletion: → Fast insertion and deletion (no shifting required). →
 * Best for frequent insert/delete operations.
 * 
 * Searching: → Slow searching because no direct index access. → Traversal is
 * required (O(n)).
 * 
 * Thread Safety: → LinkedList is NOT synchronized. → Not thread-safe by
 * default.
 */
