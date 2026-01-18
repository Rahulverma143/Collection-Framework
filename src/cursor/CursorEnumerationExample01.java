package cursor;
import java.util.Vector;
import java.util.Enumeration;

public class CursorEnumerationExample01 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("Python");
        v.add("Spring");

        Enumeration<String> e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}

// A Cursor is used to iterate (traverse) elements of a collection one by one.