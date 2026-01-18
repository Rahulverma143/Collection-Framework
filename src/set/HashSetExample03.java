package set;
import java.util.HashSet;

public class HashSetExample03 {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(15);
        hs.add(25);

        System.out.println(hs.contains(15)); // true

        hs.remove(5);
        System.out.println(hs);

        System.out.println("Size: " + hs.size());
    }
}
