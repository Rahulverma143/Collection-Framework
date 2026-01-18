package cursor;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorExample03 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");

        Iterator<String> itr = hs.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

/*
Iterator Rules:
→ Cannot modify collection directly while iterating
→ Use itr.remove() only
→ Traverses in forward direction only
→ One-time use (cannot reset)

*/