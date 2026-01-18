package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "Anil"));
		list.add(new Employee(3, "Sourabh"));
		list.add(new Employee(2, "Rahul"));

		Comparator<Employee> comp = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.name.compareTo(e2.name);
			}
		};

		System.out.println("Name wise sorting:");
		Collections.sort(list, comp);

		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			System.out.println(e.id + " " + e.name);
		}
	}
}
