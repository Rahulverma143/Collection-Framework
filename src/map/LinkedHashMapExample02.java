package map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample02 {

	public static void main(String[] args) {
		  
		        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		        map.put(1, "Java");
		        map.put(2, "Python");
		        map.put(3, "C++");
		        map.put(null, "Ruby"); // null key allowed
		        System.out.println("LinkedHashMap: " + map);

		        // Iterating over map
		        for (Integer key : map.keySet()) {
		            System.out.println(key + " -> " + map.get(key));
		        }
		    }
		}
	


