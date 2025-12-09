package com.Comparable;
	import java.util.*;
	public class LegacyExample {
	    public static void main(String[] args) {
	        // Vector
	        Vector <Integer>vector = new Vector<>();
	        vector.add(10);
	        vector.add(20);
	        vector.add(30);
	        vector.addAll(vector); 
//	        vector.clear(); 
	        vector.addAll(1, vector); 
	      
	        System.out.println(vector);
	        System.out.println("Vector elements:");
	        Enumeration<Integer> e = vector.elements();
	        while (e.hasMoreElements()) {
	            System.out.println(e.nextElement());
	        }

	        // Hashtable
	        Hashtable<String, String> table = new Hashtable<>();
	        table.put("A", "Apple");
	        table.put("B", "Banana");
	        System.out.println(table);
	        
	        Hashtable h1 = new Hashtable();
	        System.out.println("Hashtable elements:");
	        Enumeration<String> keys = table.keys();
	        while (keys.hasMoreElements()) {
	            String key = keys.nextElement();
	            System.out.println(key + " -> " + table.get(key));
	        }

	        // Stack
	        Stack<String> stack = new Stack<>();
	        stack.push("Rahul");
	        stack.push("Vema");
	        System.out.println(stack); 
	        System.out.println("Stack pop: " + stack.pop());
	    }
	}
