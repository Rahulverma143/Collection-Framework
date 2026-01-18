package set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample01 {
    public static void main(String[] args) {

        SortedSet<Integer> ss = new TreeSet<>();

        ss.add(40);
        ss.add(10);
        ss.add(30);
        ss.add(20);

        System.out.println(ss);
    }
}


/*
 → SortedSet is an interface, not a class.
→ Elements are stored in sorted order.
→ Duplicate elements are NOT allowed.
→ Null elements are NOT allowed (TreeSet throws NullPointerException).
→ It is NOT synchronized.
→ TreeSet is the most common implementation.
x
*/