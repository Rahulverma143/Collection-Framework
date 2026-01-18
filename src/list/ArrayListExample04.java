package list;

import java.util.ArrayList;

public class ArrayListExample04 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Anil");
        names.add("Devansh");

        for (String name : names) {
            System.out.println("Hello " + name);
        }
    }
}
