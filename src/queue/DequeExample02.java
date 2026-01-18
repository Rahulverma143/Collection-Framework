package queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample02 {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        // Insertion at both ends
        dq.addFirst(10);
        dq.addLast(20);
        dq.offerFirst(5);
        dq.offerLast(30);

        System.out.println("Deque: " + dq);

        // Access elements
        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());

        // Removal
        dq.removeFirst();
        dq.pollLast();

        System.out.println("After removal: " + dq);

        // Iteration
        System.out.print("Iterator: ");
        for (Integer i : dq) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

