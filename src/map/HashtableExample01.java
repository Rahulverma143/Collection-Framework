package map;


import java.util.Hashtable;

public class HashtableExample01 {

    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C++");
        table.put(4, "DSA");
   //   table.put(null, "Test");   // NullPointerException
   //   table.put(4, null);       // NullPointerException

        System.out.println("Hashtable: " + table);
    }
}



/*
  Insertion order is NOT preserved

 no null key or value
 no duplicte key 
duplicate value allow


Hashtable is synchronized → thread-safe
No null key/value allowed
Methods like put, get, remove, replace are commonly used
Iteration can be done via entrySet() or forEach()
*/