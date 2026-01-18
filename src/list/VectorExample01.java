package list;

import java.util.Vector;

public class VectorExample01 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
	}
}

/*
 Vector is a legacy class (introduced in Java 1.0) and is also part of the Collection Framework.

It internally uses a dynamic array to store elements.

Vector is a class that implements the List interface.

It is present in the java.util package.

It extends AbstractList and implements List, RandomAccess, Cloneable, and Serializable.

It maintains insertion order of elements.

It allows duplicate elements.

It allows null elements.

Vector is synchronized, so it is thread-safe by default.

Because of synchronization, performance is slower than ArrayList.

Shifting elements is slower when insertion or deletion occurs in the middle.

Vector is similar to ArrayList, but the main difference is thread safety.

Default capacity is 10.

When the capacity is exceeded, it doubles its size:
New Capacity = Old Capacity × 2
 
*/