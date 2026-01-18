package cursor;
import java.util.ArrayList;
import java.util.Spliterator;
public class SpliteratorExample01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
      
        Spliterator<Integer> sp = list.spliterator();
        System.out.println("---- Using tryAdvance() ----");
        // tryAdvance() processes elements one-by-one
        while (sp.tryAdvance((n) -> System.out.println("Element: " + n))) {
            // loop will run until elements are finished
        }
        // Create a new Spliterator again (as previous is exhausted)
        Spliterator<Integer> sp2 = list.spliterator();

        System.out.println("---- Using forEachRemaining() ----");
        //  forEachRemaining() processes all remaining elements at once
        sp2.forEachRemaining((n) -> System.out.println("Element: " + n));
    }
}
/* Spliterator:
     Spliterator stands for "Splittable Iterator".
     It is used to **traverse and partition elements** of a collection.
     Introduced in Java 8 for **parallel processing** and **stream operations**.
     It can split itself into multiple Spliterators for parallel iteration.
     Important methods:-
      -> tryAdvance()   → processes one element at a time
      -> forEachRemaining() → processes all remaining elements
      -> trySplit()     → splits the elements into a new Spliterator
      -> characteristics() → returns properties of Spliterator  */
