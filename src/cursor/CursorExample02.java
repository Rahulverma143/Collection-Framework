package cursor;
import java.util.*;

public class CursorExample02 {
    public static void main(String[] args) {
        // Create a collection of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Create a cursor (Iterator) to traverse the elements
        Iterator<Integer> cursor = numbers.iterator();

        System.out.println("Traversing elements using Cursor:");
        while (cursor.hasNext()) {
            Integer num = cursor.next(); // move cursor and get element
            System.out.println(num);

            // Example: remove a specific number while traversing
            if (num == 20) {
                cursor.remove();
            }
        }

        System.out.println("\nAfter removal: " + numbers);
    }
}
