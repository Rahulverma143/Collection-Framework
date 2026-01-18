package map;
import java.util.Hashtable;

public class HashtableExample03 {
    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable<>();

        table.put("Apple", 50);
        table.put("Banana", 20);
        table.put("Mango", 30);

        // Iterating
        table.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}

// Keys are not sorted, order may vary.