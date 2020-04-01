package com.bet.people;

import com.bet.payments.Payable;

public class Staff extends Person implements Payable {

	private int staffId;
	private String jobTitle;
	
	public Staff(String firstName, String lastName, int staffId, String jobTitle) {
		super(firstName, lastName);
		this.staffId = staffId;
		this.jobTitle = jobTitle;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "\nStaff ID: " + this.staffId
				+ "\nJob Title: " + this.jobTitle;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Staff " 
				+ getFirstName() + " " + getLastName()
				+ " got paid " + amount);
	}
	
	/**
	 * @return the staffId
	 */
	public int getStaffId() {
		return staffId;
	}
	/**
	 * @param staffId the staffId to set
	 */
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
