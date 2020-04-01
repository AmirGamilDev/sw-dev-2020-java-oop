package com.example.employees;

public class CommissionEmployee extends Employee {

	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, double commissionRate) {
		super(firstName, lastName);

		if(commissionRate > 0 && commissionRate < 1) {
			this.commissionRate = commissionRate;
		} else {
			this.commissionRate = 0;
		}
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nCommission Rate: " 
				+ this.commissionRate * 100 + "%";
	}
	
	public double calculateMonthlyEarnings(double monthlySales) {
		return monthlySales * this.commissionRate;
	}
	
	/**
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
}
