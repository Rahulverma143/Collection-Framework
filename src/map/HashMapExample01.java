package map;

import java.util.HashMap;

public class HashMapExample01 {

	public static void main(String[] args) {
		
		 HashMap map = new HashMap();
		map.put(1, "Java");
		map.put(2, "SpringBoot");
		map.put(3, "MicroServices");
		map.put(4, "MicroServices");  // value can be duplicate
		map.put(4, "DSA");   // override value
		map.put(null, "C++");
		map.put(5, null);
		System.out.println(map);
		
		
		// Generic define
		 HashMap <Integer, String> mp = new HashMap<Integer, String>();
		 mp.put(1, "HTML");   // Entry[inner interface[map interface]]
		 mp.put(2, "CSS");
		 mp.put(3, "JS");
		 System.out.println(mp);   // {1=HTML, 2=CSS, 3=JS}
		  
		 String m = mp.get(2);
			System.out.println(m);
	}

}	
// HashMap is a part of Java Collections Framework that stores data in key-value pairs.
// It allows one null key and multiple null values and is not synchronized (not thread-safe).
//  insertion order not perserved
// value can be duplicate
// key only unique 
// key and value also be null
