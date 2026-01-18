package list;
import java.util.Vector;
public class VectorExample02 {

		public static void main(String[] args) {
			// Creating a vector of String type
			Vector<String> v = new Vector<>();

			
			v.add("Hello");
			v.add("World");

			// Accessing elements
			String firstElement = v.get(0);
			System.out.println("First Element: " + firstElement);  // Output: First Element: Hello

			// Removing an element
			v.remove(1);
			System.out.println(v);  // Output: [Hello]
		}
	}