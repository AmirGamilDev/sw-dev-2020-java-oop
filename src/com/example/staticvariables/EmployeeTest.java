package com.example.staticvariables;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Joe", "Bloggs");
		Employee employee2 = new Employee("Steve", "McQueen");
		Employee employee3 = new Employee("Peter", "Venkman");
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
		if(employee2.equals(employee1)) {
			System.out.println("Same person!");
		} else {
			System.out.println("Not same person!");
		}

		if(employee1.equals(employee1)) {
			System.out.println("Same person!");
		} else {
			System.out.println("Not same person!");
		}
		
		if(employee1.equals("A string")) {
			System.out.println("Cannot happen");
		} else {
			System.out.println("This HAD to happen!");
		}
	}
}
