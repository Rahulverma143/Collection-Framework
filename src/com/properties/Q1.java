package com.properties;


	class Vehicle {
		void display(){
			 System.out.println("This is a display");
		}
	    Vehicle() {
	        System.out.println("This is a Vehicle");
	    }
	}
	// Subclass 
	class Car extends Vehicle {
	    Car() {
	        System.out.println("This Vehicle is Car");
	    }
	}
	public class Q1 {
	    public static void main(String[] args) {
	        // Creating object of subclass invokes base class constructor
	        Vehicle obj = new Car();
	        obj.display();
	    }
	}