package list;

import java.util.Vector;

public class VectorExample05 {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		System.out.println(v.capacity()); // 10
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		v.add(80);
		v.add(90);
		v.add(100);
		v.add(110);
		System.out.println(v.capacity()); // 20
		v.add(null);
		System.out.println(v);

	}

}
// capacity by default 10.
// capacity increase by (current capacity * 2) (10*2= 20).