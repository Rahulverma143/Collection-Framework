package legacyClass;
import java.util.Enumeration;   
import java.util.Properties;   

public class PropertiesExample2 {

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
        while(enm.hasMoreElements()) {         // hasMoreElements() → checks if more keys exist
            Object keys = enm.nextElement();   // nextElement() → fetch next key (Object type)
            System.out.println(keys);          // Print the key
        }
    }
}
