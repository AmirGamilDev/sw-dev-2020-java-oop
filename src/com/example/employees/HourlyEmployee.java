package com.example.employees;

public class HourlyEmployee extends Employee {

	private double hourlyWage;
	
	public HourlyEmployee(String firstName, String lastName,
			double wage) {
		super(firstName, lastName);
		
		this.hourlyWage = wage;
	}
	
	public double calculateEarnings(double hoursWorked) {
		if(hoursWorked > 168 || hoursWorked < 0) {
			System.out.println("Hours worked must be between "
					+ "0 and 168");
			
			return 0;
		}
		
		if(hoursWorked > 40) {
			return (40 * this.hourlyWage) 
					+ ((hoursWorked - 40) * hourlyWage * 1.5);
		}
		
		return this.hourlyWage * hoursWorked;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nWage: " + this.hourlyWage;
	}

	/**
	 * @return the wage
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * @param wage the wage to set
	 */
	public void setHourlyWage(double wage) {
		if(wage < 0) return;
		
		this.hourlyWage = wage;
	}
}
