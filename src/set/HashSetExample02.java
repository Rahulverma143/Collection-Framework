package set;

import java.util.HashSet;

public class HashSetExample02 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Java");
        hs.add("Python");
        hs.add("Java");   // duplicate
        hs.add(null);
        hs.add(null);     // ignored

        System.out.println(hs);
    }
}
