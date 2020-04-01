package com.example.staff;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Jack", "Jackson", 2000);
		Employee employee2 = new Employee("Jenifer", "Smith", 3000);
		
		displayEmployeeDetails(employee1);
		displayEmployeeDetails(employee2);
		
		employee1.increaseSalary(0.1);
		employee2.increaseSalary(0.1);
		
		System.out.println();
		
		displayEmployeeDetails(employee1);
		displayEmployeeDetails(employee2);
	}
	
	static void displayEmployeeDetails(Employee employee) {
		String output = String.format("Employee Info:"
				+ "\nName: %s"
				+ "\nMontly Salary: €%.2f"
				+ "\nYearly Salary: €%.2f",
				(employee.getFirstName() + " " + employee.getLastName()),
				employee.getSalary(),
				calculateEmployeeYearlySalary(employee));
		
		System.out.println(output);
	}
	
	static double calculateEmployeeYearlySalary(Employee employee) {
		return employee.getSalary() * 12;
	}

}
