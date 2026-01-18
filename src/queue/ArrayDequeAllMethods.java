package queue;
	import java.util.*;
	public class ArrayDequeAllMethods {
	    public static void main(String[] args) {
	        ArrayDeque<String> dq = new ArrayDeque<>();

	        // ---------- INSERTION ----------
	        dq.add("A");              // add at end
	        dq.addFirst("B");         // add at front
	        dq.addLast("C");          // add at end
	        dq.offer("D");            // add at end
	        dq.offerFirst("E");       // add at front
	        dq.offerLast("F");        // add at end
	        System.out.println("After insertions: " + dq);
	        // Output: [E, B, A, C, D, F]

	        // ---------- ACCESS / PEEK ----------
	        System.out.println("peek(): " + dq.peek());         // head element -> E
	        System.out.println("peekFirst(): " + dq.peekFirst());// first element -> E
	        System.out.println("peekLast(): " + dq.peekLast());  // last element -> F
	        System.out.println("getFirst(): " + dq.getFirst());  // first element -> E
	        System.out.println("getLast(): " + dq.getLast());    // last element -> F
	        System.out.println("element(): " + dq.element());    // head element -> E

	        // ---------- REMOVAL ----------
	        dq.remove();              // removes head (E)
	        dq.removeFirst();         // removes first (B)
	        dq.removeLast();          // removes last (F)
	        dq.poll();                // removes head (A)
	        dq.pollFirst();           // removes first (C)
	        dq.pollLast();            // removes last (D)
	        System.out.println("After removals: " + dq);
	        // Output: []

	        // ---------- STACK OPERATIONS ----------
	        dq.push("X");             // push at front
	        dq.push("Y");
	        dq.push("Z");
	        System.out.println("After push: " + dq);
	        // Output: [Z, Y, X]

	        System.out.println("pop(): " + dq.pop());  // removes first (Z)
	        System.out.println("After pop: " + dq);
	        // Output: [Y, X]

	        // ---------- UTILITY METHODS ----------
	        System.out.println("Size: " + dq.size());         // 2
	        System.out.println("Contains X? " + dq.contains("X")); // true
	        System.out.println("Is empty? " + dq.isEmpty());  // false

	        // ---------- ITERATORS ----------
	        System.out.print("Iterator: ");
	        Iterator<String> it = dq.iterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");  // Y X
	        }
	        System.out.println();

	        System.out.print("Descending Iterator: ");
	        Iterator<String> descIt = dq.descendingIterator();
	        while (descIt.hasNext()) {
	            System.out.print(descIt.next() + " "); // X Y
	        }
	        System.out.println();

	        // ---------- TO ARRAY ----------
	        Object[] arr = dq.toArray();
	        System.out.println("Converted to Array: " + Arrays.toString(arr));
	        // Output: [Y, X]

	        // ---------- CLEAR ----------
	        dq.clear();
	        System.out.println("After clear(): " + dq);
	        // Output: []
	    }
	}
