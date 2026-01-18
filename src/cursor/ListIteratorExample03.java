package cursor;
import java.util.*;
public class ListIteratorExample03 {
	
	
	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        ListIterator<Integer> li = list.listIterator();
	        System.out.println("Forward:");
	        while (li.hasNext()) {
	            System.out.println(li.next());
	        }
	        System.out.println("Backward:");
	        while (li.hasPrevious()) {
	            System.out.println(li.previous());
	        }
	    }
	}
/*
Forward:
10
20
30
Backward:
30
20
10

*/