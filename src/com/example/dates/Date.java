package com.example.dates;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

		// note: simplification of error state
		if(month < 1 || month > 12) {
			this.month = 1;
		}
		
		if(day < 1 || day > 31) {
			this.day = 1;
		}
	}

	public void displayDate() {
		System.out.println(this.day + "-" + this.month + "-" + this.year);
	}
	
	public void displayDateAlpha() {
		System.out.println(this.year + "-" + this.month + "-" + this.day);
	}
	
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
}
