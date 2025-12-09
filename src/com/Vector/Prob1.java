package com.Vector;

import java.util.Vector;
	class Hello{
	
	}
public class Prob1 {
	public static void main(String[] args) {
		Vector  v = new Vector();
		v.addElement(12);
		v.addElement(12.0);
		v.addElement(true);
		v.addElement("String");
		v.addElement(new Hello());
		System.out.println(v);
		
	}
}

//  output: 
//  [12, 12.0, true, String, com.Vector.Hello@50040f0c] 

///*
//package com.Vector;  // Declares this file belongs to package com.Vector
//
//import java.util.Vector;  // Importing Vector class from java.util package
//
//// A simple class Hello (empty class)
//class Hello {  
//}
//
//// Main class (file name must be Prob1.java because it's public)
//public class Prob1 {
//
//    // main method → program execution starts here
//    public static void main(String[] args) {
//
//        // Create a Vector object 'v'
//        // Vector is like a growable array that can hold objects of any type
//        Vector v = new Vector();
//
//        // Add integer 12 into the Vector
//        // Autoboxing: int → Integer object
//        v.addElement(12);
//
//        // Add double 12.0 into the Vector
//        // Autoboxing: double → Double object
//        v.addElement(12.0);
//
//        // Add boolean true into the Vector
//        // Autoboxing: boolean → Boolean object
//        v.addElement(true);
//
//        // Add String object into the Vector
//        v.addElement("String");
//
//        // Add object of class Hello into the Vector
//        // new Hello() creates an instance of Hello class
//        v.addElement(new Hello());
//
//        // Print the Vector
//        // Vector overrides toString() → prints elements like a list
//        // For Hello object (no toString defined), memory address (hashcode) will be shown
//        System.out.println(v);
//    }
//}/*
