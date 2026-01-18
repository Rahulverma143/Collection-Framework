package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample02 {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Java");
        lhs.add("Python");
        lhs.add("Spring");
        lhs.add(null);
        lhs.add(null); // ignored

        System.out.println(lhs);
    }
}
