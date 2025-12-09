package com.List;
import java.util.LinkedList;
public class LinkedListExample {
	// LinkedList:- Doubly linked list
	// Provides methods like addFirst(), addLast(), offer(), peek(), poll()
	public static void main(String[] args) {
		
		// Create a LinkedList object
        // Heterogeneous elements allowed (different types)
		LinkedList ll = new LinkedList();
			ll.add(20);
			ll.add(50.5);
			ll.add("Rahul");
			ll.add(true);
			ll.add("Rahul");  // duplicate allowed
			ll.add(null);   // null allowed
			
			 // Print current LinkedList
			System.out.println(ll);
			
			ll.addFirst("FirstElement");   // add this 0 index
			ll.addLast("LastElement");    //add this last index
			ll.add(2, 500);   
			System.out.println(ll);
			
			System.out.println(ll.peek()); // shows first element (list same)
			System.out.println(ll);        // prints full list

			System.out.println(ll.poll()); // shows first element AND removes it
			System.out.println(ll);        // prints list without that element

			
			ll.offer(11);
			ll.offerFirst(22);  // Add element at the beginning
			ll.offerLast(33);  // Add element at the end
			System.out.println(ll);
	}
}
