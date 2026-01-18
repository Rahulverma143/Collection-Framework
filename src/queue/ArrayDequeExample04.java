package queue;

import java.util.ArrayDeque;

public class ArrayDequeExample04 {

	public static void main(String[] args) {
		ArrayDeque ad1 = new ArrayDeque();
		ad1.addFirst(20);
		ad1.addLast(80);
		ad1.add(10);
		ad1.addLast(500);
		

		System.out.println(ad1);
		System.out.println(ad1.size());    // Returns number of elements.
		System.out.println(ad1.isEmpty());  // Checks if deque is empty.  (True or false) 
		System.out.println(ad1.getClass());
		System.out.println(ad1.getClass().getName());
		System.out.println(ad1.toString());
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
		System.out.println(ad1.getFirst());
		System.out.println(ad1.removeLast());
		System.out.println(ad1.contains(1000));
		

		
	}

}
