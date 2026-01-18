package cursor;
import java.util.*;
import java.util.ArrayList;

public class IteratorExample01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

/*
// 1. Iterator in Java:- 

->  Iterator is a cursor used to traverse elements one by one in a collection in a forward direction. (like ArrayList, HashSet, etc.).
->  Iterator is an interface in the java.util package.
->  It allows only forward traversal (from first element to last element).
->  Used to iterate elements of any Collection (List, Set, Queue) in a forward direction.
->  It is a universal cursor, meaning it can be used with any collection in the Collection Framework.
->  If the structure of the collection is modified (except by remove()), it throws ConcurrentModificationException.
->  It is present in the java.util package and is an interface.
->  It provides three main methods:
                -> hasNext() – checks if more elements are present.  // Boolean value returns.
                -> next() – returns the next element.  // returns the element.
                -> remove() – removes the last element returned by next().  // removes the element.
*/