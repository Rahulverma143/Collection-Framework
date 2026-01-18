package cursor;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorExample02 {
    public static void main(String[] args) {
        // ArrayList: A resizable array implementation of List interface.
        ArrayList <Integer>al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        ListIterator<Integer> listr = al.listIterator();
        System.out.println("--------Forward Direction--------");
        //  Forward Traversal: from start to end
        while (listr.hasNext()) {
            Object o = listr.next(); // returns the next element
            System.out.println(o);
        }
        System.out.println("--------Reverse Direction--------");
        //  Backward Traversal: from end to start
        while (listr.hasPrevious()) {
            Object o1 = listr.previous(); // returns the previous element
            System.out.println(o1);
        }
    }
}
/* ListIterator:-
   It is a special type of iterator used to traverse a list in both directions — forward and backward.
   It is available only for List implementations (like ArrayList, LinkedList).
   Methods:
   hasNext()      → checks if next element is available
   next()         → returns next element
   hasPrevious()  → checks if previous element is available
   previous()     → returns previous element */

