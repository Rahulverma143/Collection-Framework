package map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample03 {

	public static void main(String[] args) {
		SortedMap<String, Integer> map = new TreeMap<>();

		map.put("Banana", 40);
		map.put("Apple", 10);
		map.put("Mango", 30);

		System.out.println(map);  //SortedMap with String Keys (Alphabetical Order)

	}

}
