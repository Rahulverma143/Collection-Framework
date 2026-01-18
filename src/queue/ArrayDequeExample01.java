package queue;
import java.util.ArrayDeque;
public class ArrayDequeExample01 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(15);
		ad.add("hello");
		ad.add(15.2); 
		ad.add(10);
		System.out.println(ad);
		ArrayDeque ad1 = new ArrayDeque();
		ad1.addFirst(20);
		ad1.addLast(80);
		ad1.addAll(ad);
		ad1.add(10);
		ad1.addLast(500);
		System.out.println(ad1);
	}
}

/*
// ArrayDeque:-
-> It is a class in java.util package. (It extends AbstractCollection)
-> It implements Deque interface.
-> Deque(I) extends Queue(I) interface. then Collection(I) then Iterable(I)
-> It is a Double Ended Queue → supports addFirst() and addLast().
-> Index-based insertion/access is not allowed.
-> Duplicates are allowed in ArrayDeque.
-> Null elements are NOT allowed.
-> Faster than Stack and LinkedList for stack/queue operations.
("Index-based insertion/access is not allowed" means you cannot use position numbers (like 0, 1, 2…)
 to add or get elements because that data structure doesn’t store elements in order or by position.)
// What is Deque ---- 
  -> A Deque in Java stands for Double-Ended Queue.
-> It is a special type of queue where you can insert and remove elements from both ends (front and rear).
*/