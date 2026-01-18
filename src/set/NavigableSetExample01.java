package set;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample01 {
    public static void main(String[] args) {

        NavigableSet<Integer> ns = new TreeSet<>();

        ns.add(10);
        ns.add(20);
        ns.add(30);
        ns.add(40);

        System.out.println(ns);
    }
}

/*
 → NavigableSet is an interface.
→ Maintains sorted (ascending) order.
→ Duplicate elements are NOT allowed.
→ Null elements are NOT allowed.
→ Provides methods to navigate elements.
→ Not synchronized (not thread-safe).

 */
