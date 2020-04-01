package com.example.heart;

import java.time.LocalDate;
import java.time.Period;

public class HeartRates {

	private String firstName;
	private String lastName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	
	public HeartRates(String firstName, String lastName, 
			int birthDay, int birthMonth, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
	}

	public int getAgeInYears() {
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		LocalDate now = LocalDate.now();
		
		Period diff = Period.between(birthDate, now);
		
		int ageInYears = diff.getYears();
		
		return ageInYears;
	}
	
	public int calculateMaxHeartRate() {
		return 220 - getAgeInYears();
	}
	
	public String calculateTargetHeartRate() {
		double lowerRange = (double)calculateMaxHeartRate() * 0.5;
		double higherRange = (double)calculateMaxHeartRate() * 0.85;
		
		return lowerRange + "-" + higherRange;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDay
	 */
	public int getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return the birthMonth
	 */
	public int getBirthMonth() {
		return birthMonth;
	}

	/**
	 * @param birthMonth the birthMonth to set
	 */
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	/**
	 * @return the birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * @param birthYear the birthYear to set
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
