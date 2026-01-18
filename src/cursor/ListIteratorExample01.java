package cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample01{
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		
		ListIterator listr = al.listIterator();

		System.out.println("--------Forward Direction----");
		while (listr.hasNext()) {
			Object o = listr.next();
			System.out.println(o);
		}

		System.out.println("--------Reverse Direction----");
		while (listr.hasPrevious()) {
			Object o1 = listr.previous();
			System.out.println(o1);
		}
	}
}


/*
// 2. ListIterator in Java:-
-> ListIterator is a child interface of Iterator used only with List classes
->  ListIterator is a bidirectional cursor – it allows you to traverse a list forward and backward.
->  It can be used only with List-based collections (like ArrayList, LinkedList), not with Set or Map.
-> It is present in the java.util package and is an interface.
-> It gives more control than Iterator, including modification of elements during iteration.
-> Like Iterator, modifying the list structure directly while iterating causes ConcurrentModificationException.
->  It provides several methods:
            -> hasNext() / next() – move forward
            -> hasPrevious() / previous() – move backward
            -> add(), remove(), set() – modify list elements
            -> nextIndex(), previousIndex() – get current index positions
*/