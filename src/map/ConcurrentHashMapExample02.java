package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample02 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

		// Adding elements
		map.put("A", 100);
		map.put("B", 200);

		// Update using compute
		map.compute("A", (key, val) -> val + 50);

		// Remove using remove(key, value)
		map.remove("B", 200);

		System.out.println("Map after modifications: " + map);
	}
}
