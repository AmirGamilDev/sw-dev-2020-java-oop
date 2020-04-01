package com.bet.companies;

import java.util.List;

public class ContractingCompany extends Company {

	private List<Integer> courseIds;

	public ContractingCompany(int companyId, String companyName, List<Integer> courseIds) {
		super(companyId, companyName);
		this.courseIds = courseIds;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nCourse IDs: " + this.courseIds;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Contracting Company " 
				+ getCompanyName()
				+ " got paid " + amount);
	}

	/**
	 * @return the courseIds
	 */
	public List<Integer> getCourseIds() {
		return courseIds;
	}

	/**
	 * @param courseIds the courseIds to set
	 */
	public void setCourseIds(List<Integer> courseIds) {
		this.courseIds = courseIds;
	}
}
