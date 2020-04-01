package com.example.staff;

public class Employee {

	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		
		if(salary < 0) {
			this.salary = 0;
		}
	}

	public void increaseSalary(double fraction) {
		//this.salary += this.salary * (percent / 100); <-- another way if
		// passing in percent (e.g. argument is 10 for 10%)
		
		this.salary *= 1 + fraction;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return this.salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		if(salary < 0) return;
		
		this.salary = salary;
	}
}
