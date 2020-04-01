package com.bet.people;

import com.bet.payments.Payable;

public class Student extends Person implements Payable {

	private String studentId;
	private String courseId;
	private String courseTitle;
	
	public Student(String firstName, String lastName, String studentId, String courseId, String courseTitle) {
		super(firstName, lastName);
		this.studentId = studentId;
		this.courseId = courseId;
		this.courseTitle = courseTitle;
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		
		output += "\nStudent ID: " + this.studentId;
		output += "\nCourse ID: " + this.courseId;
		output += "\nCourse Title: " + this.courseTitle;
		
		return output;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Student " 
				+ getFirstName() + " " + getLastName()
				+ " got paid " + amount);
	}
	
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}
	/**
	 * @param courseId the courseId to set
	 */
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	/**
	 * @return the courseTitle
	 */
	public String getCourseTitle() {
		return courseTitle;
	}
	/**
	 * @param courseTitle the courseTitle to set
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
}
