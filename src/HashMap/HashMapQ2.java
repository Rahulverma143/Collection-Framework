package HashMap;

import java.util.HashMap;

public class HashMapQ2 {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(120, "Rahul");
        hm.put(140, "Tarun");
        hm.put(115, "Devansh");
        hm.put(130, "Rohit");
     
    

        System.out.println(hm);
        System.out.println(Integer.valueOf(120).hashCode());
        System.out.println(Integer.hashCode(120));
        System.out.println(String.valueOf("Rahul").hashCode());
        System.out.println(hm.getClass());
        System.out.println(hm.containsKey(120));
    }
}
