package legacyClass;

import java.util.Vector;
import java.util.Enumeration;

public class VectorLegacyExample01 {
    public static void main(String[] args) {

        // Creating Vector
        Vector<String> v = new Vector<>();

        // add()
        v.add("Java");
        v.add("Python");
        v.add("Spring");

        // addElement() - legacy method
        v.addElement("Hibernate");

        // size()
        System.out.println("Size: " + v.size());

        // capacity()
        System.out.println("Capacity: " + v.capacity());

        // get(index)
        System.out.println("Get index 1: " + v.get(1));

        // elementAt(index) - legacy
        System.out.println("Element at index 2: " + v.elementAt(2));

        // contains()
        System.out.println("Contains Java: " + v.contains("Java"));

        // Enumeration (legacy cursor)
        System.out.println("\nUsing Enumeration:");
        Enumeration<String> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // remove()
        v.remove("Python");

        // removeElement() - legacy
        v.removeElement("Spring");

        // Final Vector
        System.out.println("\nFinal Vector: " + v);
    }
}
