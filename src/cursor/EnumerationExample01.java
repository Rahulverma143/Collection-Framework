package cursor;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample01 {
    public static void main(String[] args) {
    	
        // Create a Vector (legacy class)
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Mango");
        vector.add("Grapes");

        // Get Enumeration for the vector
        Enumeration<String> e = vector.elements();

        // Iterate elements using Enumeration
        System.out.println("Fruits in the vector:");
        while (e.hasMoreElements()) {
            String fruit = e.nextElement();
            System.out.println(fruit);
        }
    }
}

/*
-> Enumeration is a interface (there is a cursor).
-> Enumeration is a cursor point basically before the first elements(points).

<!-- Enumeration has two methods:-  -->
  1. HasMoreELements: return type boolean.                          (abstract method)
  2. nextElements: object type return.(elements ko return karte hai). (abstract  method)

 -> hasMoreElements() → checks if there are more elements.
 -> nextElement() → returns the next element in the collection.

    -> Enumeration is a legacy cursor
    -> Used to read elements one by one
*/