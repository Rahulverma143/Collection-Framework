package cursor;
import java.util.ArrayList;
import java.util.ListIterator;
public class IteratorExample02 {
    public static void main(String[] args) {
        //  ArrayList: A resizable array class in Java that implements the List interface.
        // It stores elements in insertion order and allows duplicates.
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        ListIterator<Integer> listr = al.listIterator();

        System.out.println("--------Forward Direction--------");
        //  Forward Traversal: goes from the first element to the last element
        while (listr.hasNext()) {       // checks if next element exists
            Object o = listr.next();    // returns the next element
            System.out.println(o);       
        }
    }
}


/* ListIterator:
   It is an interface in Java used to iterate over elements of a List (like ArrayList).
   It allows **bidirectional traversal** (forward and backward).
   Commonly used methods:
   hasNext()     → checks if there is a next element
   next()        → returns the next element
   hasPrevious() → checks if there is a previous element
   previous()    → returns the previous element
   Unlike Iterator, ListIterator works only with classes that implement List (e.g., ArrayList, LinkedList). */
