package set;

import java.util.TreeSet;

public class TreeSetExample04 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		ts.add(60);
		ts.add(70);
		System.out.println(ts);
		System.out.println(ts.ceiling(20));  // 20
		System.out.println(ts.ceiling(25));  // 30  
		System.out.println(ts.ceiling(75));   // null 
		System.out.println(ts.higher(20));  // 30 always print bigger 
		System.out.println(ts.higher(70));  // otherwise null 
		System.out.println(ts.floor(30));  // smaller or equal other wirse null 
		System.out.println(ts.floor(35)); 
		System.out.println(ts.floor(5)); 
		System.out.println(ts.lower(25));  // next smallest elements otherwise null 
		System.out.println(ts.lower(20)); 
		System.out.println(ts.lower(10));
		System.out.println(ts.tailSet(30));  //gives all elements from given value to tailend [30, 40, 50, 60, 70]
		System.out.println(ts.tailSet( 30, false));   // [40, 50, 60, 70] 
		System.out.println(ts.headSet(30));  // given all elements from start till given value [10, 20]
		System.out.println(ts.headSet(30, false));
	}
}