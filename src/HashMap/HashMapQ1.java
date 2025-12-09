package HashMap;

import java.util.HashMap;

public class HashMapQ1 {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(120, "Rahul");
        hm.put(101, "Amit");
        hm.put(115, "Devansh");
        hm.put(130, "Rohit");
        hm.put(140, "Tarun");
        hm.put(150, "Rajdeep");
        hm.put(160, "Ajay");

        System.out.println(hm);

        System.out.println(hm.get(115));

        // Remove a key-value pair
        hm.remove(140);
        System.out.println(hm);

        // Check if a key exists
        System.out.println(hm.containsKey(101));

        // Check if a value exists
        System.out.println(hm.containsValue("Rahul"));

        // Iterate through all entries
        System.out.println("\nIterating HashMap:");
        for (Object key : hm.keySet()) {
            System.out.println(key + " -> " + hm.get(key));
        }
    }
}
