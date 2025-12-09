package com.singleton;

class ExamlpleSingleton {

}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamlpleSingleton  s1 = new ExamlpleSingleton ();
		ExamlpleSingleton  s2 = new ExamlpleSingleton ();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s2.hashCode());
	}

}
