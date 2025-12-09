package com.Dictionary;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

//import java.util.*;

public class DictionaryExample {
    public static void main(String[] args) {
        // Dictionary is abstract, so using Hashtable as subclass
        Dictionary<String, String> dict = new Hashtable<>();
        dict.put("A", "Apple");
        dict.put("B", "Banana");
//      dict.put("C", null);   // nullPointerexception 
        dict.put("D", "Mango");

        // Get keys using Enumeration
        Enumeration<String> keys = dict.keys();
        while(keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + " = " + dict.get(key));
        }
    }
}
