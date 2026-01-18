package queue;
import java.util.PriorityQueue;

public class PriorityQueueExample01 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);

        System.out.println(pq); // Internal heap representation (order may not appear sorted)

        System.out.println("Head of queue (peek): " + pq.peek()); // smallest element
    }
}

/*
→ Implements Queue and Collection interfaces.
→ Elements are stored based on priority (min-heap by default).
→ Duplicate elements are allowed.
→ Null elements are NOT allowed.
→ Not synchronized (not thread-safe).
→ Head of the queue is the element with the highest priority (smallest element by default).
→ Can be customized using a Comparator.

*/