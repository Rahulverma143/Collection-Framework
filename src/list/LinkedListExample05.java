package list;

import java.util.LinkedList;

// LinkedList as Queue
public class LinkedListExample05 {

    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Rahul");
        queue.add("Amit");
        queue.add("anil");

        System.out.println("Head: " + queue.peek());
        System.out.println("Remove: " + queue.poll());
        System.out.println("Queue: " + queue);
    }
}

/*
================ METHOD EXPLANATION =================

1) add(E e)
   - Inserts element at the end of the queue
   - Follows FIFO order
   - Example: queue.add("Rahul");

2) peek()
   - Returns the first element (head of queue)
   - Does NOT remove the element
   - Returns null if queue is empty
   - Example: queue.peek();

3) poll()
   - Removes and returns the first element
   - Follows FIFO (First In First Out)
   - Returns null if queue is empty
   - Example: queue.poll();

4) LinkedList as Queue
   - LinkedList implements Deque interface
   - It can be used as Queue, Stack, or Deque
   - Insertion & deletion are faster than ArrayList

OUTPUT:
Head: Rahul
Remove: Rahul
Queue: [Amit, anil]

====================================================
*/
