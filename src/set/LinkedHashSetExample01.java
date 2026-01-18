package set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample01 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(20); // duplicate

        System.out.println(lhs);
    }
}


/*
→ LinkedHashSet implements Set interface.
→ It maintains insertion order.
→ Duplicate elements are NOT allowed.
→ Only one null element is allowed.
→ It is NOT synchronized (not thread-safe).
→ Slightly slower than HashSet due to order maintenance.
→ Uses hash table + doubly linked list internally.

*/