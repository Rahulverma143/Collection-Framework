package com.List;
import java.util.ArrayList;
class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Q2Array {
    public static void main(String[] args) {

        // 1. ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println("Fruits: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        fruits.remove("Mango");
        System.out.println("After removal: " + fruits);

        // 2. ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nNumbers: " + numbers);
        System.out.println("Size: " + numbers.size());
        System.out.println("Second number: " + numbers.get(1));

        // 3. ArrayList of Custom Objects
        ArrayList<Customer> students = new ArrayList<>();
        students.add(new Customer("Rahul", 20));
        students.add(new Customer("Anita", 22));
        students.add(new Customer("Rohan", 19));

        System.out.println("\nStudents: " + students);

        // Accessing custom object
        Customer firstStudent = students.get(0);
        System.out.println("First student: " + firstStudent.name + ", Age: " + firstStudent.age);

        // Iterating over ArrayList
        System.out.println("\nAll students:");
        for (Customer s : students) {
            System.out.println(s);
        }
    }
}
