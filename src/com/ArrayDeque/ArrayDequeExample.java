package com.ArrayDeque;  // package name

import java.util.ArrayDeque;  // import class

public class ArrayDequeExample {

	public static void main(String[] args) {

		ArrayDeque<Integer> ad = new ArrayDeque<Integer>(); // Integer deque
		ad.add(10);   // add elements
		ad.add(54);
		ad.add(15);
		ad.add(20);
		ad.add(70);
		System.out.println(ad);       // print deque
		System.out.println(ad.size()); // print size
		
		ArrayDeque ad1 = new ArrayDeque(); // raw type deque (mixed data)
		ad1.add(10);       // int
		ad1.add(50.2);     // double
		ad1.add(58);       // int
		ad1.add("rahul");  // string
		ad1.addAll(ad);    // add all from ad
		ad1.addFirst(60);  // add at front
		ad1.addLast(900);  // add at end
		System.out.println(ad1); // print deque
		
		ArrayDeque ad2 = new ArrayDeque(); // new deque
		ad2.offer(20);        // add at end
		ad2.offerFirst(90);   // add at front
		ad2.offerLast(200);   // add at end
		System.out.println(ad2); // print deque
	}
}
