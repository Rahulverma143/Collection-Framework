package com.TreeSet;

import java.util.TreeSet;
public class TreesetQ2 {
	public static void main(String[] args) {
		TreeSet<Integer>ts = new TreeSet<Integer>();  
        ts.add(71);    
        ts.add(18);   
        ts.add(84);    
        ts.add(97);    
        ts.add(38);
        ts.add(77);
        ts.add(65);   
        ts.add(21);   
        ts.add(49);
        ts.add(73);    
        ts.add(38);   
        ts.add(71);   
        ts.add(88);
        System.out.println(ts);
//        ts.pollFirst(); 
        System.out.println(ts.pollFirst()); // remove first elements
//        System.out.println(ts); 
        ts.pollFirst();System.out.println(ts.pollLast());  // remove last elemenst 
        System.out.println(ts);
        

	}

}
