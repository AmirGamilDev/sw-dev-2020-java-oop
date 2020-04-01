package com.example.employees;

public class EmplolyeesTest {

	public static void main(String[] args) {
		
		CommissionEmployee commissionEmployee = 
				new CommissionEmployee("Joe", "Bloggs", 0.2);
		
		System.out.println("\n" + commissionEmployee.toString());
		
		System.out.println("\nEarnings for " + commissionEmployee.getFirstName() + " "
				+ commissionEmployee.getLastName() + ": " 
				+ commissionEmployee.calculateMonthlyEarnings(10000));
		
		BasePlusCommissionEmployee basePlusCommissionEmployee = 
				new BasePlusCommissionEmployee("Steve", "Bloggs", 0.1, 5000);
		
		System.out.println("\n" + basePlusCommissionEmployee);
		
		System.out.println("\nEarnings for " + basePlusCommissionEmployee.getFirstName() + " "
				+ basePlusCommissionEmployee.getLastName() + ": "
				+ basePlusCommissionEmployee.calculateMonthlyEarnings(10000));
		
		
		
		BasePlusCommissionEmployee bpc2 = new BasePlusCommissionEmployee("Joe", "Bloggs", 0.3, 200);
		CommissionEmployee c2 = new CommissionEmployee("Joe", "Bloggs", 0.5);
		
		if(bpc2.equals(c2)) {
			System.out.println("Same person!");
		} else {
			System.out.println("Not the same person!");
		}
	}
}
