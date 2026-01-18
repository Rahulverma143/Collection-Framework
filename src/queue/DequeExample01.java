package queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample01 {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        // Push elements (LIFO)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack using Deque: " + stack);

        // Pop elements
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);
    }
}

/*
Deque is a double-ended queue that allows insertion, removal, and access of elements from both front and rear ends.
Double-Ended Queue: Insert/remove elements from both front and rear.

Interface: Implemented by ArrayDeque and LinkedList.

Queue & Stack: Can act as FIFO (queue) or LIFO (stack).

No nulls, duplicates allowed: Null elements not allowed; duplicates are okay.

Key Methods:

Insert: addFirst(), addLast(), offerFirst(), offerLast()

Remove: removeFirst(), removeLast(), pollFirst(), pollLast()

Access: getFirst(), getLast(), peekFirst(), peekLast()

Stack: push(), pop()
*/