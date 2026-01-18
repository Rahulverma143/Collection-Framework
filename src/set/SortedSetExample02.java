package set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample02 {
    public static void main(String[] args) {

        SortedSet<Integer> ss = new TreeSet<>();

        ss.add(10);
        ss.add(20);
        ss.add(30);
        ss.add(40);
        ss.add(50);

        System.out.println("First: " + ss.first());
        System.out.println("Last: " + ss.last());
        
        System.out.println(ss.headSet(30)); 
        System.out.println(ss.tailSet(30)); 
        System.out.println(ss.subSet(20, 50)); 
    }
}


// SortedSet is a Set interface that stores unique elements in sorted order.