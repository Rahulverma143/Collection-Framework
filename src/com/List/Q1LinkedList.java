package com.List;

import java.util.LinkedList;

//Custom class
class Student {
 String name;
 int age;

 Student(String name, int age) {
     this.name = name;
     this.age = age;
 }

 public String toString() {
     return name + " (" + age + ")";
 }
}

public class Q1LinkedList {
 public static void main(String[] args) {

     // 1. LinkedList of Strings
     LinkedList<String> fruits = new LinkedList<>();
     fruits.add("Apple");           // add at end
     fruits.add("Mango");
     fruits.addFirst("Banana");     // add at first
     fruits.addLast("Orange");      // add at last
     System.out.println("Fruits: " + fruits);

     fruits.remove("Mango");        // remove by value
     fruits.removeFirst();          // remove first element
     fruits.removeLast();           // remove last element
     System.out.println("After removals: " + fruits);

     System.out.println("First fruit: " + fruits.getFirst());
     System.out.println("Last fruit: " + fruits.getLast());
     System.out.println("Contains Apple? " + fruits.contains("Apple"));

     fruits.set(0, "Grapes");       // update element
     System.out.println("After set: " + fruits);

     // 2. LinkedList of Integers
     LinkedList<Integer> numbers = new LinkedList<>();
     numbers.add(10);
     numbers.add(20);
     numbers.add(30);
     numbers.addFirst(5);           // add at first
     numbers.addLast(35);           // add at last
     System.out.println("\nNumbers: " + numbers);

     System.out.println("Size: " + numbers.size());
     System.out.println("Peek first: " + numbers.peek());    // get first element
     System.out.println("Poll first: " + numbers.poll());    // get & remove first element
     System.out.println("Numbers after poll: " + numbers);

     // 3. LinkedList of Custom Objects
     LinkedList<Student> students = new LinkedList<>();
     students.add(new Student("Rahul", 20));
     students.add(new Student("Verma", 22));
     students.add(new Student("Rohan", 19));
     students.addFirst(new Student("Devansh", 21));

     System.out.println("\nStudents: " + students);

     // Accessing first and last student
     System.out.println("First student: " + students.getFirst());
     System.out.println("Last student: " + students.getLast());

     // Iterating over LinkedList
     System.out.println("\nAll students:");
     for(Student s : students) {
         System.out.println(s);
     }

     // Clear all elements
     students.clear();
     System.out.println("Students after clear: " + students);
 }
}
