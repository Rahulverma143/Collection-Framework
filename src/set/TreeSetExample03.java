package set;

import java.util.TreeSet;

public class TreeSetExample03 {

	    public static void main(String[] args) {

	        TreeSet<Integer> ts = new TreeSet<>();

	        ts.add(10);
	        ts.add(20);
	        ts.add(30);
	        ts.add(40);

	        System.out.println("First: " + ts.first());
	        System.out.println("Last: " + ts.last());
	        System.out.println("Lower than 25: " + ts.lower(25));
	        System.out.println("Higher than 25: " + ts.higher(25));
	        
	         System.out.println(ts.headSet(30));
	         System.out.println(ts.tailSet(30));
	       System.out.println(ts.subSet(20, 50));
	    }
	}
