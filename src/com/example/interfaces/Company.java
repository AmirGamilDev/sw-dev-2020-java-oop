package com.example.interfaces;

public class Company implements Payable {

	private String companyName;

	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}

	@Override
	public void pay(double amount) {
		System.out.println(this.companyName + " got paid " + amount );
	}
	
	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
