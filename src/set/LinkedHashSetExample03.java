package set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample03 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        // add()
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(20); // duplicate ignored

        // contains()
        System.out.println(lhs.contains(20)); // true

        // remove()
        lhs.remove(10);

        // size()
        System.out.println("Size: " + lhs.size());

        // isEmpty()
        System.out.println("Is Empty: " + lhs.isEmpty());

        // iterator()
        for (Integer i : lhs) {
            System.out.println(i);
        }

        // clear()
        lhs.clear();
        System.out.println(lhs);
    }
}
