package list;
import java.util.LinkedList;

public class LinkedListExample03 {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("Java");
        ll.add("Python");
        ll.add("React");

        ll.addFirst("HTML");
        ll.addLast("Spring");

        System.out.println("List: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("After remove: " + ll);
    }
}
