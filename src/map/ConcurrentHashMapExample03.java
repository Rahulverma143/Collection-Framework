package map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample03 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // 1. put
        map.put("A", 10);
        map.put("B", 20);

        // 2. get
        System.out.println("Get A: " + map.get("A"));

        // 3. remove
        map.remove("B");

        // 4. containsKey / containsValue
        System.out.println("Contains key A? " + map.containsKey("A"));
        System.out.println("Contains value 20? " + map.containsValue(20));

        // 5. size / isEmpty
        System.out.println("Size: " + map.size());
        System.out.println("Is Empty? " + map.isEmpty());

        // 6. putIfAbsent
        map.putIfAbsent("C", 30);

        // 7. replace
        map.replace("A", 10, 100);

        // 8. keySet / values / entrySet
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // 9. compute
        map.compute("C", (key, val) -> val + 10);

        // 10. forEach
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
