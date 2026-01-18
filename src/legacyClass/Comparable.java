package legacyClass;

import java.util.ArrayList;



class Student {
	String name;
	int age;
	String location;
	public Student(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
}

public class Comparable {

	public static void main(String[] args) {
		Student s1 = new Student("Rahul", 21, "Jammu");
		Student s2 = new Student("Devansh", 22, "Jaipur");
		Student s3 = new Student("Tarun", 23, "Bikaner");
		Student s4 = new Student("Rohit", 24, "rajastham");
		Student s5 = new Student("Rajdeep", 25, "Sikkar");
		Student s6 = new Student("Anil", 24, "Kota");

		ArrayList<Student> student = new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);
		student.add(s5);
		student.add(s6);
		System.out.println(student);
		
	}

}
