package map;

import java.util.HashMap;

public class HashMapExample05 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(120, "Rahul");
		hm.put(140, "Tarun");
		hm.put(115, "Devansh");
		hm.put(130, "Rohit");

		System.out.println(hm);
		System.out.println(Integer.valueOf(120).hashCode());
		System.out.println(Integer.hashCode(120));
		System.out.println(String.valueOf("Rahul").hashCode());
		System.out.println(hm.getClass());
		System.out.println(hm.containsKey(120));
	}
}

// {130=Rohit, 115=Devansh, 120=Rahul, 140=Tarun}
// 120
// 120
// 78722128
// class java.util.HashMap
// true