package com.example.employees;

public class Employee {

	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee Details:"
				+ "\nFirst Name: " + this.firstName
				+ "\nLast Name: " + this.lastName;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
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
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object other) {
		Employee otherEmployee = (Employee) other;
		
		if(firstName.equals(otherEmployee.getFirstName())
				&& lastName.equals(otherEmployee.getLastName())) {
			return true;
		} else {
			return false;
		}
	}
}
