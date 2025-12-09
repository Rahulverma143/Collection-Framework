package com.Anonymous;

	// Parent class
	class Person {
	    // Method of Person class
	    void greet() {
	        System.out.println("Hi!");  // Prints "Hi!" when called
	    }
	}

	// Main class
	public class AnonymousExample {
	    public static void main(String[] args) {
	        
	        // Creating an anonymous inner class that extends Person
	        Person p = new Person() {  
	            // Overriding the greet() method of Person
	            void greet() {
	                System.out.println("Hello from anonymous class!");  
	                // This will be called instead of Person's greet()
	            }
	        };
	        
	        // Calling greet() on the object p
	        p.greet();  
	        // Output: "Hello from anonymous class!"
	        // Even though p is of type Person, the overridden method in anonymous class executes
	    }
	}
