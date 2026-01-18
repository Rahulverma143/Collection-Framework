package map;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample02 {

	public static void main(String[] args) {
		HashMap<String, String> hsm = new HashMap<>();
        hsm.put("India", "Delhi");
        hsm.put("USA", "Washington");
        hsm.put("Japan", "Tokyo");
        hsm.put("France", "Paris");
        hsm.put("Germany", "Berlin");
        hsm.put("Canada", "Ottawa");
	
      Set<String> arr = hsm.keySet();
       Object [] a = arr.toArray();
       for(int i = 0; i < a.length; i++) {
    	    Object key = a[i];
    	    int hs = key.hashCode();
    	    int bucketid = hs % 10;

    	    System.out.println("Key: " + key);
    	    System.out.println("HashCode: " + hs);
    	    System.out.println("Bucket ID: " + bucketid);
    	    System.out.println("--------------------");
    	}

	}
}
