package list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample04 {

    public static void main(String[] args) {

        // Vector of String
        Vector<String> v = new Vector<>();

        v.add("Java");
        v.add("Python");
        v.add("Spring");

        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());

        v.remove("Python");     // remove element
        v.set(1, "React");      // replace element

        System.out.println("Vector: " + v);

        // Vector of Integer
        Vector<Integer> vt = new Vector<>();
        vt.add(100);
        vt.add(200);
        vt.add(300);

        // Enumeration traversal
        Enumeration<Integer> e = vt.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
