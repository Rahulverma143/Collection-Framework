package legacyClass;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class DictionaryExample02 {
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
