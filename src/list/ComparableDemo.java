package list;

import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student> {

    String name;
    int age;
    String location;

    public Student(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Natural sorting by age
    @Override
    public int compareTo(Student s) {
        return Integer.compare(this.age, s.age);
    }
    
    @Override
    public String toString() {
        return name + " " + age + " " + location;
    }
}
public class ComparableDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 22, "Jammu");
        Student s2 = new Student("Devansh", 22, "Jaipur");
        Student s3 = new Student("Tarun", 23, "Bikaner");
        Student s4 = new Student("Rohit", 24, "Rajasthan");
        Student s5 = new Student("Rajdeep", 25, "Sikar");
        Student s6 = new Student("Anil", 21, "Kota");

        ArrayList<Student> student = new ArrayList<>();

        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        student.add(s5);
        student.add(s6);

        System.out.println("Before Sorting:");
        System.out.println(student);

        Collections.sort(student);

        System.out.println("\nAfter Sorting (by age):");
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }
}
