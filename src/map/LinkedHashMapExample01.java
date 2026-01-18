package map;

//import java.util.LinkedHashMap;
//   
//public class LinkedHashMapExample01 {
//
//	public static void main(String[] args) {
//		
//      LinkedHashMap lhm = new LinkedHashMap();
//      
//      lhm.put(1, "Java");
//      lhm.put(2, "SpringBoot");
//      lhm.put(3, "MicroServices");
//      System.out.println(lhm);
//	}
//
//}

import java.util.LinkedHashMap;

public class LinkedHashMapExample01 {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println(map);  // LinkedHashMap maintains insertion order
    }
}

// LinkedHashMap is a class in java
// It introduced in JDK 1.4
// It maintains Insertion order preserved
// Store data in key-value pairs
// key must be unique and value can be null
// key can be null
// value can be duplicate
// Not synchronized → not thread-safe
