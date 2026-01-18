package queue;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Iterator;

public class PriorityQueueExample03 {
    public static void main(String[] args) {

        // Create a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1) add(E e)  Adds element, throws exception if fails
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(40);
        System.out.println("PriorityQueue after add(): " + pq);

        // 2) offer(E e)  Adds element, returns false if fails
        pq.offer(15);
        System.out.println("PriorityQueue after offer(): " + pq);

        // 3) peek()  Returns head element without removing, null if empty
        System.out.println("Peek (head): " + pq.peek());

        // 4) element()  Returns head element without removing, exception if empty
        System.out.println("Element (head): " + pq.element());

        // 5) poll()  Removes and returns head element, null if empty
        System.out.println("Poll: " + pq.poll());
        System.out.println("After poll(): " + pq);

        // 6) remove()  Removes and returns head element, exception if empty
        System.out.println("Remove: " + pq.remove());
        System.out.println("After remove(): " + pq);

        // 7) contains(Object o)  Checks if element exists
        System.out.println("Contains 20? " + pq.contains(20));
        System.out.println("Contains 50? " + pq.contains(50));

        // 8) size()  Returns number of elements
        System.out.println("Size: " + pq.size());

        // 9) isEmpty()  Checks if queue is empty
        System.out.println("Is Empty? " + pq.isEmpty());

        // 10) clear()  Removes all elements
        pq.clear();
        System.out.println("After clear(): " + pq);
        System.out.println("Is Empty now? " + pq.isEmpty());

        System.out.println("-------------------");

        // 11) Custom PriorityQueue (Max-Heap) using Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(50);
        maxHeap.add(10);
        maxHeap.add(30);
        System.out.println("Max-Heap PriorityQueue: " + maxHeap);

        // 12) Iterating using Iterator
        System.out.print("Iterating Max-Heap: ");
        Iterator<Integer> it = maxHeap.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Poll elements to show priority order
        while(!maxHeap.isEmpty()) {
            System.out.println("Poll from Max-Heap: " + maxHeap.poll());
        }
    }
}

/* 
======================== PriorityQueue Methods Explanation ========================

1) add(E e)       -> Adds an element to the queue; throws exception if capacity exceeded.
2) offer(E e)     -> Adds an element to the queue; returns false if capacity exceeded.
3) peek()         -> Returns head element without removing; returns null if empty.
4) element()      -> Returns head element without removing; throws exception if empty.
5) poll()         -> Removes and returns head element; returns null if empty.
6) remove()       -> Removes and returns head element; throws exception if empty.
7) contains(o)    -> Returns true if element exists in the queue.
8) size()         -> Returns number of elements in the queue.
9) isEmpty()      -> Checks if the queue is empty.
10) clear()       -> Removes all elements from the queue.
11) PriorityQueue<>(Collections.reverseOrder()) -> Creates a max-heap (largest element first).
12) iterator()    -> Iterates over the elements (internal order may not be sorted).

====================================================================================
*/
