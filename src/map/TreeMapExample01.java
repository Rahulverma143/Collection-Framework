package map;

import java.util.TreeMap;

public class TreeMapExample01 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(1, "HTML");
		tm.put(2, "CSS");
		tm.put(4, "JS");
		tm.put(3, "React");
		tm.put(1, null);
//		tm.put(null, "Node");   // Error  NullPOinterEXception
		System.out.println(tm);
		

	}

}

/*  
TreeMap stores elements in sorted order of keys and does not allow null keys.
TreeMap is a class in Java that implements NavigableMap and SortedMap,
 It stores key-value pairs in sorted order of keys.
 Sorted Order follow (Sorted Key)
 value can be duplicate 
*/