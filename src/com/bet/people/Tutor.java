package com.bet.people;

public class Tutor extends Staff {

	private String speciality;

	public Tutor(String firstName, String lastName, int staffId, String jobTitle, String speciality) {
		super(firstName, lastName, staffId, jobTitle);
		this.speciality = speciality;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nTutor Speciality: " + this.speciality;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Tutor " 
				+ getFirstName() + " " + getLastName()
				+ " got paid " + amount);
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
}
