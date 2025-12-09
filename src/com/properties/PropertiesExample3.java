package com.properties;
import java.util.Enumeration;   
import java.util.Properties;    

public class PropertiesExample3 {

    public static void main(String[] args) {
        // Create a Properties object
        Properties p = new Properties();

        // Add key-value pairs (Course → Duration)
        p.put("Java", "10-12 Months");     
        p.put("Python", "8-10 Months");    
        p.put("Mern", "6-8 Months");       
        p.put("C/C++", "5-7 Months");      
        p.put("DSA", "6-7 Months");        

        // Print the entire Properties object (unordered)
        System.out.println(p);

        System.out.println("------------\n");

        // Get Enumeration of all KEYS
        Enumeration enm = p.propertyNames(); // propertyNames() → returns keys as Enumeration

        // Iterate safely over all keys using while loop
        while(enm.hasMoreElements()) {          // hasMoreElements() → checks if more keys exist
            String keys = (String)enm.nextElement(); // nextElement() → fetch next key (cast to String)
            String value = p.getProperty(keys);     // getProperty(key) → fetch the corresponding value
            System.out.println(keys + "  " + value); // Print key and value together
        }
    }
}
