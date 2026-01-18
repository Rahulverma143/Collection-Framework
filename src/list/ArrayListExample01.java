package list;
import java.util.ArrayList;
public class ArrayListExample01 {
	    public static void main(String[] args) {
	        ArrayList al = new ArrayList();
	        al.add(10);
	        al.add(20);
	        al.add(30);
	        System.out.println(al);
	    }
	}

/*
ArrayList is a class present in the java.util package.

It stores elements using a dynamic array data structure.

ArrayList implements the List interface.

So, it maintains insertion order.

It allows duplicate elements.

It allows multiple null values.

ArrayList follows the order in which elements are added.

ArrayList is NOT thread-safe.

Dynamic Array:
A dynamic array is an array whose size can grow or shrink automatically at runtime.

Initial Capacity of ArrayList is 10.

Growth Formula:
newCapacity = (oldCapacity * 3) / 2 + 1

Example:
Initial capacity = 10
After adding 11th element → capacity becomes:
(10 * 3) / 2 + 1 = 16

After exceeding 16 → next capacity becomes:
(16 * 3) / 2 + 1 = 25

Good for Searching, Slow for Insert/Delete
*/


