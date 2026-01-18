package queue;
import java.util.PriorityQueue;

public class PriorityQueueExample02 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.add(40);

        System.out.println("Original Queue: " + pq);

        System.out.println("Poll: " + pq.poll()); // removes 20
        System.out.println("After Poll: " + pq);

        System.out.println("Remove: " + pq.remove()); // removes 40
        System.out.println("After Remove: " + pq);
    }
}
