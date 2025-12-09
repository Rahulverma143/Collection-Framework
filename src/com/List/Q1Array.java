package com.List;

import java.util.ArrayList;

public class Q1Array {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		System.out.println(a);
		
		a.add("Rahul");
		a.add(null);
		
		System.out.println(a);
		
		ArrayList aa = new ArrayList();
		aa.contains(a);
		aa.addLast(20);
		aa.addLast(null);
		aa.addLast("verma");
		System.out.println(10);
		System.out.println(aa.getClass().getName());    //class java.util.ArrayList 
		System.out.println(aa.get(2));
		System.out.println(aa.getFirst());
		System.out.println(aa.getLast());
		System.out.println(aa.getClass());

		
		

	}

}
