package HashMap;
import java.util.HashMap;
public class HashMapExampleClass {
    public static void main(String[] args) {
       
        HashMap<String, String> hm = new HashMap<>();
        hm.put("India", "Delhi");
        hm.put("USA", "Washington");
        hm.put("Japan", "Tokyo");
     
        String key = "India";
        int hs = key.hashCode();
        System.out.println(hs);
        int bucketid = hs%10;
        System.out.println(bucketid);
        
        String key1 = "Japan";
        int hs1 = key1.hashCode();
        System.out.println(hs1);
        int bucketid1 = hs1%10;
        System.out.println(bucketid1);
        
        String key2 = "USA";
        int hs2 = key2.hashCode();
        System.out.println(hs2);
        int bucketid3 = hs2%10;
        System.out.println(bucketid3);
        

       
    }
}
