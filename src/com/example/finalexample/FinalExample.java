package com.example.finalexample;

import com.example.employees.Employee;

public class FinalExample {

	public static final int TOO_WARM = 38;
	public static final int TOO_COLD = -10;
	
	public static void main(String[] args) {				
		Employee employee = new Employee("Joe", "Bloggs");
		
		changeEmployee(employee);
	}
	
	static void changeEmployee(final Employee employee) {
		// this is not allowed as employee is final
		//employee = new Employee("Agent", "Smith");

		// this is allowed - we are not changing final, just one of its properties
		employee.setFirstName("Optiumus");
		
		System.out.println(employee);
	}

}
