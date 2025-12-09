package com.TreeSet;
import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("TreeSet: " + numbers);

        // 1. ceiling() – ≥ given element
        System.out.println("ceiling(25): " + numbers.ceiling(25)); // 30
        System.out.println("ceiling(30): " + numbers.ceiling(30)); // 30

        // 2. higher() – > given element
        System.out.println("higher(30): " + numbers.higher(30));   // 40
        System.out.println("higher(50): " + numbers.higher(50));   // null

        // 3. floor() – ≤ given element
        System.out.println("floor(25): " + numbers.floor(25));     // 20
        System.out.println("floor(10): " + numbers.floor(10));     // 10

        // 4. lower() – < given element
        System.out.println("lower(20): " + numbers.lower(20));     // 10
        System.out.println("lower(10): " + numbers.lower(10));     // null

        // 5. tailSet() – all ≥ fromElement (or > if false)
        System.out.println("tailSet(30): " + numbers.tailSet(30)); // [30, 40, 50]
        System.out.println("tailSet(30, false): " + numbers.tailSet(30, false)); // [40, 50]

        // 6. headSet() – all < toElement (or ≤ if true)
        System.out.println("headSet(30): " + numbers.headSet(30)); // [10, 20]
        System.out.println("headSet(30, true): " + numbers.headSet(30, true)); // [10, 20, 30]
    }
}
