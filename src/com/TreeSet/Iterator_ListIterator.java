package com.TreeSet;

import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator_ListIterator {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		
		ListIterator listr = al.listIterator();

		System.out.println("--------Forward Direction----");
		while (listr.hasNext()) {
			Object o = listr.next();
			System.out.println(o);
		}

		System.out.println("--------Reverse Direction----");
		while (listr.hasPrevious()) {
			Object o1 = listr.previous();
			System.out.println(o1);
		}
	}
}
