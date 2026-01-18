package list;
import java.util.ArrayList;

public class ArrayListExample03 {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        
        
        }

        }
    }

