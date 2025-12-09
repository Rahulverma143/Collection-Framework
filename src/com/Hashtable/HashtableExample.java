package com.Hashtable;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("Math", 90);
        ht.put("Physics", 80);
        ht.put("Chemistry", 85);
        

        System.out.println(ht);
        System.out.println("Marks in Physics: " + ht.get("Physics"));
    }
}
