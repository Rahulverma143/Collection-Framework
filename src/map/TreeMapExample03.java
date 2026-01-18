package map;

	import java.util.TreeMap;
	import java.util.Iterator;
	import java.util.Map;

	public class TreeMapExample03 {

	    public static void main(String[] args) {
	        TreeMap<Integer, String> tm = new TreeMap<>();
	        tm.put(1, "HTML");
	        tm.put(2, "CSS");
	        tm.put(4, "JS");
	        tm.put(3, "React");
	        tm.put(1, null); // replaces value for key 1

	        System.out.println("TreeMap: " + tm);

	        // Using while loop with Iterator over entrySet()
	        Iterator<Map.Entry<Integer, String>> itr = tm.entrySet().iterator();

	        System.out.println("\nIterating using while loop:");
	        while (itr.hasNext()) {
	            Map.Entry<Integer, String> entry = itr.next();
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	        }

	        // Using while loop with Iterator over keySet() to get values
	        Iterator<Integer> keyItr = tm.keySet().iterator();
	        System.out.println("\nIterating keys and getting values:");
	        while (keyItr.hasNext()) {
	            Integer key = keyItr.next();
	            System.out.println("Key = " + key + ", Value = " + tm.get(key));
	        }
	    }
	}
