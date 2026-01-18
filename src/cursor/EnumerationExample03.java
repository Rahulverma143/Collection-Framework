package cursor;

import java.util.Hashtable;
import java.util.Enumeration;

public class EnumerationExample03 {
    public static void main(String[] args) {

        // -------- Hashtable 1 (Keys + Values) --------
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "Java");
        ht1.put(2, "Python");
        ht1.put(3, "React");

        Enumeration<Integer> e1 = ht1.keys();

        System.out.println("Keys and Values:");
        while (e1.hasMoreElements()) {
            Integer key = e1.nextElement();
            System.out.println(key + " = " + ht1.get(key));
        }

        // -------- Hashtable 2 (Only Values) --------
        Hashtable<Integer, String> ht2 = new Hashtable<>();
        ht2.put(101, "Spring");
        ht2.put(102, "Hibernate");

        Enumeration<String> e2 = ht2.elements();

        System.out.println("\nOnly Values:");
        while (e2.hasMoreElements()) {
            System.out.println(e2.nextElement());
        }
    }
}

/*
Keys and Values:
3 = React
2 = Python
1 = Java

Only Values:
Hibernate
Spring

*/