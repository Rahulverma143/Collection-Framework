package com.singleton;

	// Singleton Class

class Singleton {

	private static Singleton obj = null;

	      // private Contstructor
	
	private Singleton() {
		System.out.println("Object created");
	}

	public static Singleton getObj() {
		if (obj == null) {
			obj = new Singleton();    // create only once
		}
		return obj;

	}
}

public class Test {

	public static void main(String[] args) {

		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());
		System.out.println(Singleton.getObj());    // all same object
	}

}
