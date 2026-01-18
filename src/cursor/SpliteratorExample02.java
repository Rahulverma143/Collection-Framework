package cursor;
import java.util.*;
public class SpliteratorExample02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Spliterator<Integer> sp = list.spliterator();
        sp.forEachRemaining(System.out::println);
    }
}

/*
// 3. Spliterator in Java:-
-> Spliterator (Split Iterator) is a cursor introduced in Java 8 to traverse and split elements of a collection.
-> It supports sequential and parallel traversal, useful for parallel programming.
-> It supports a method trySplit() to split the elements into parts, which helps in parallel processing.
-> It s an interface in java.util package.
-> Mostly used internally by Streams API but can also be used manually for custom traversal.
->  Common methods:-
        -> tryAdvance(Consumer action) – processes one element at a time.
        -> forEachRemaining(Consumer action) – processes all remaining elements.
        -> trySplit() – splits elements for parallel use.
        -> characteristics() – returns properties like ORDERED, DISTINCT, etc.

*/
/*
-> Iterator → Simple forward traversal.
-> ListIterator → Forward + backward traversal + modification (List only).
-> Spliterator → Traversal + parallel processing support.

Real-Life Example:-
-> Think of a cursor like a TV remote 📺 –
-> It helps you go next channel (forward) → Iterator
-> It helps you go next & previous → ListIterator
-> It lets many people control different TVs at the same time → Spliterator (parallel processing)

*/