package com.bet.companies;

import com.bet.payments.Payable;

public abstract class Company implements Payable {

	private int companyId;
	private String companyName;
	
	public Company(int companyId, String companyName) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
	}
	
	@Override
	public String toString() {
		return "Company ID: " + this.companyId
				+ "\nCompany Name: " + this.companyName;
	}
	
	/**
	 * @return the companyId
	 */
	public int getCompanyId() {
		return companyId;
	}
	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
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
