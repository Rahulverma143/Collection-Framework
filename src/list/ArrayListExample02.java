package list;
	import java.util.ArrayList;
	public class ArrayListExample02 {
	    public static void main(String[] args) {

	        ArrayList<String> al = new ArrayList<>();

	        al.add("Java");
	        al.add("Python");
	        al.add("React");

	        System.out.println("List: " + al);
	        System.out.println("Size: " + al.size());
	        System.out.println("Get index 1: " + al.get(1));

	        al.remove("Python");
	        al.set(1, "Spring");

	        System.out.println("After update: " + al);
	    }
	}
	/*
	Disadvantage of ArrayList (Shifting Problem):

	→ If an element is inserted at the beginning (index 0),
	   all existing elements are shifted one position to the right.

	→ If an element is removed from the beginning (index 0),
	   all remaining elements are shifted one position to the left.

	→ This shifting operation takes extra time.

	→ Therefore, insertion and deletion in the beginning or middle
	   are slow in ArrayList.

	→ ArrayList is not suitable for frequent insert/delete operations
	   at the beginning or middle.
	*/
