package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample02 {
    public static void main(String[] args) {

        // Create an ArrayDeque of integers
        Deque<Integer> adq = new ArrayDeque<>();

        // ---------------- Queue Operations (FIFO) ----------------
        System.out.println("=== Queue Operations ===");

        // Add elements at the rear
        adq.addLast(10);
        adq.addLast(20);
        adq.addLast(30);

        System.out.println("Queue: " + adq);

        // Remove elements from front
        System.out.println("Removed: " + adq.removeFirst());
        System.out.println("After removal: " + adq);

        System.out.println("Peek front: " + adq.peekFirst());
        System.out.println();

        // ---------------- Stack Operations (LIFO) ----------------
        System.out.println("=== Stack Operations ===");

        // Push elements (add at front)
        adq.push(100);
        adq.push(200);
        adq.push(300);

        System.out.println("Stack: " + adq);

        // Pop elements (remove from front)
        System.out.println("Pop: " + adq.pop());
        System.out.println("After pop: " + adq);

        // Peek top element
        System.out.println("Peek top: " + adq.peek());
    }
}
