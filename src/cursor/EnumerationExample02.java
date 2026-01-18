package cursor;
import java.util.Vector;
import java.util.Enumeration;

public class EnumerationExample02 {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

/*
Enumeration limitations:
→ Only works with legacy classes (Vector, Hashtable)
→ No remove() method (read-only)
→ Not fail-fast
→ Cannot traverse in reverse direction

*/