package com.singleton;

class ExampleSingleton2 {
	// private constructor
	private ExampleSingleton2() {
	}
	// method --> singleton (object returm) -> public

	public static ExampleSingleton2 getObj() {
		return new ExampleSingleton2();

	}
}

public class Q1 {

	public static void main(String[] args) {

	 //Singleton s = Singleton.getObj();
		// System.out.println(s);
		System.out.println(ExampleSingleton2.getObj());
		System.out.println(ExampleSingleton2.getObj());
		System.out.println(ExampleSingleton2.getObj());
	}

}
