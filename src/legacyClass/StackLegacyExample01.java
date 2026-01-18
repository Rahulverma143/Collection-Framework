package legacyClass;
import java.util.Stack;

public class StackLegacyExample01 {
    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> s = new Stack<>();

        // push()
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        // peek()
        System.out.println("Top Element (peek): " + s.peek());

        // pop()
        System.out.println("Removed Element (pop): " + s.pop());

        System.out.println("Stack after pop: " + s);

        // search()
        System.out.println("Position of 10: " + s.search(10));

        // empty()
        System.out.println("Is Stack Empty: " + s.empty());
    }
}
