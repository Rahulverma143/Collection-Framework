package list;
import java.util.ArrayList;
		

public class ArrayListExample05 {
	public static void main(String[] args) {
		
		ArrayList  al = new ArrayList();   //Hetrogenous Elements
		
		 al.add(10);
		 al.add(30.5);
		 al.add("Rahul");
		 al.add(true);
		 al.add("Rahul");   // Duplicate allowed
		 System.out.println(al.size());  // Print size of ArrayList
		 System.out.println(al);   //insertion order 
		 
		ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(25);
		a2.add(22);
		a2.add(1, 100);    // Adding 50 at 1 index  
		a2.addAll(al);    // adding Collection in current array
		System.out.println(a2);
		a2.addAll(1, al);  
		
		// Print size of ArrayList
        System.out.println("Total elements in a2: " + a2.size());
		System.out.println(a2);
	}
}

				//Disadvamtage:-
				// When we insert or remove an element at the start or middle.
				// It causes shifting of element
				// In such cases, LinkedList is preferred.	