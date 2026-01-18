package queue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeExample03 {
    public static void main(String[] args) {

        // Create ArrayDeque
        Deque<Integer> adq = new ArrayDeque<>();

        // ------------------- Insertion Methods -------------------
        adq.addFirst(10);     // Adds 10 at front
        adq.addLast(20);      // Adds 20 at rear
        adq.offerFirst(5);    // Adds 5 at front
        adq.offerLast(25);    // Adds 25 at rear

        System.out.println("After insertions: " + adq); // [5, 10, 20, 25]

        // ------------------- Access Methods -------------------
        System.out.println("First element (getFirst): " + adq.getFirst());
        System.out.println("Last element (getLast): " + adq.getLast());
        System.out.println("Peek first: " + adq.peekFirst()); // safe access
        System.out.println("Peek last: " + adq.peekLast());   // safe access

        // ------------------- Removal Methods -------------------
        System.out.println("Remove first (removeFirst): " + adq.removeFirst()); // removes 5
        System.out.println("Remove last (removeLast): " + adq.removeLast());   // removes 25
        System.out.println("Poll first (pollFirst): " + adq.pollFirst());      // removes 10
        System.out.println("Poll last (pollLast): " + adq.pollLast());         // removes 20

        System.out.println("After removals: " + adq); // []

        // ------------------- Stack Methods (LIFO) -------------------
        adq.push(100); // adds at front
        adq.push(200);
        adq.push(300);

        System.out.println("Stack using ArrayDeque: " + adq);
        System.out.println("Pop (removes front): " + adq.pop());
        System.out.println("After pop: " + adq);

        // ------------------- Utility Methods -------------------
        adq.add(400);
        adq.add(500);
        adq.add(600);

        System.out.println("Contains 500? " + adq.contains(500));
        System.out.println("Size: " + adq.size());
        System.out.println("Is Empty? " + adq.isEmpty());

        // ------------------- Iteration -------------------
        System.out.print("Forward iteration: ");
        Iterator<Integer> it = adq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        System.out.print("Backward iteration: ");
        Iterator<Integer> desc = adq.descendingIterator();
        while (desc.hasNext()) {
            System.out.print(desc.next() + " ");
        }
        System.out.println();

        // Clear all elements
        adq.clear();
        System.out.println("After clear, isEmpty? " + adq.isEmpty());
    }
}

/*
==================== ArrayDeque Methods Explanation ====================

Insertion:
- addFirst(E e): Add element at front, throws exception if fails
- addLast(E e): Add element at rear, throws exception if fails
- offerFirst(E e): Add element at front, returns false if fails
- offerLast(E e): Add element at rear, returns false if fails

Access:
- getFirst(): Returns front element, exception if empty
- getLast(): Returns rear element, exception if empty
- peekFirst(): Returns front element, null if empty
- peekLast(): Returns rear element, null if empty

Removal:
- removeFirst(): Removes front element, exception if empty
- removeLast(): Removes rear element, exception if empty
- pollFirst(): Removes front element, null if empty
- pollLast(): Removes rear element, null if empty

Stack Methods:
- push(E e): Add element at front (stack push)
- pop(): Remove and return element from front (stack pop)

Utility:
- contains(o): Checks if element exists
- size(): Returns number of elements
- isEmpty(): Checks if empty
- clear(): Removes all elements

Iteration:
- iterator(): Forward iteration (front → rear)
- descendingIterator(): Backward iteration (rear → front)

========================================================================
*/
