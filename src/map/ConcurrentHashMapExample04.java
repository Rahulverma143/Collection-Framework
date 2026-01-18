package map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ConcurrentHashMapExample04 {
    public static void main(String[] args) {
        // Creating a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // 1. put(K key, V value) - Adds or replaces a key-value pair
        map.put("A", 10);
        map.put("B", 20);

        // 2. get(Object key) - Returns the value for a key
        System.out.println("get A: " + map.get("A"));

        // 3. remove(Object key) - Removes a key-value pair
        map.remove("B");

        // 4. remove(Object key, Object value) - Removes if key has this value
        map.put("C", 30);
        map.remove("C", 25); // won't remove
        System.out.println("Map after remove check: " + map);

        // 5. containsKey(Object key) - Checks if key exists
        System.out.println("Contains A? " + map.containsKey("A"));

        // 6. containsValue(Object value) - Checks if value exists
        System.out.println("Contains value 30? " + map.containsValue(30));

        // 7. size() - Returns number of elements
        System.out.println("Size: " + map.size());

        // 8. isEmpty() - Checks if map is empty
        System.out.println("Is empty? " + map.isEmpty());

        // 9. putIfAbsent(K key, V value) - Adds key-value if key is absent
        map.putIfAbsent("A", 50); // won't replace
        map.putIfAbsent("D", 40); // will add

        // 10. replace(K key, V value) - Replaces value for a key
        map.replace("D", 100);

        // 11. replace(K key, V oldValue, V newValue) - Replaces only if current value matches
        map.replace("D", 50, 200); // won't replace
        map.replace("D", 100, 200); // will replace

        // 12. keySet() - Returns Set of keys
        System.out.println("Keys: " + map.keySet());

        // 13. values() - Returns Collection of values
        System.out.println("Values: " + map.values());

        // 14. entrySet() - Returns Set of Map.Entry
        System.out.println("Entries: " + map.entrySet());

        // 15. compute(K key, BiFunction) - Update value using function
        map.compute("A", (k, v) -> v + 5);

        // 16. computeIfAbsent(K key, Function) - Add if key is absent
        map.computeIfAbsent("E", k -> 500);

        // 17. computeIfPresent(K key, BiFunction) - Update only if key exists
        map.computeIfPresent("A", (k, v) -> v * 2);

        // 18. forEach(BiConsumer) - Iterates safely over all entries
        System.out.println("Iterating map:");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        // 19. merge(K key, V value, BiFunction) - Merge new value with old
        map.merge("A", 50, (oldVal, newVal) -> oldVal + newVal);

        // 20. replaceAll(BiFunction) - Replace all values using function
        map.replaceAll((k, v) -> v + 10);

        // Final map state
        System.out.println("Final map: " + map);
    }
}
