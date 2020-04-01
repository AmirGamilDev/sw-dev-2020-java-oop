package com.example.employees;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseMonthlyPay;
	
	public BasePlusCommissionEmployee(String firstName, String lastName,
			double commissionRate, double baseMonthlyPay) {
		super(firstName, lastName, commissionRate);
		
		this.baseMonthlyPay = baseMonthlyPay;
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		
		output += "\nBase Monthly Pay: " + this.baseMonthlyPay;
		
		return output;
	}

	@Override
	public double calculateMonthlyEarnings(double monthlySales) {
		return super.calculateMonthlyEarnings(monthlySales) + baseMonthlyPay;
	}
	
	/**
	 * @return the baseMonthlyPay
	 */
	public double getBaseMonthlyPay() {
		return baseMonthlyPay;
	}

	/**
	 * @param baseMonthlyPay the baseMonthlyPay to set
	 */
	public void setBaseMonthlyPay(double baseMonthlyPay) {
		this.baseMonthlyPay = baseMonthlyPay;
	}
}
