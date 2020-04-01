package com.example.heart;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your first name");
		String firstName = scanner.nextLine();
		
		System.out.println("Please enter your last name");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter your day of birth");
		int dayOfBirth = scanner.nextInt();

		System.out.println("Please enter your month of birth");
		int monthOfBirth = scanner.nextInt();
		
		System.out.println("Please enter your year of birth");
		int yearOfBirth = scanner.nextInt();
		
		HeartRates heartRate = new HeartRates(firstName, lastName,
				dayOfBirth, monthOfBirth, yearOfBirth);

		System.out.println("Name: " + heartRate.getFirstName() + " " + 
				heartRate.getLastName());
		
		String output = String.format("%d/%d/%d", 
				heartRate.getBirthDay(),
				heartRate.getBirthMonth(),
				heartRate.getBirthYear());
		
		System.out.println("Date of Birth: " + output);
		
		System.out.println("Age: " + heartRate.getAgeInYears());
		System.out.println("Max heart rate: " + heartRate.calculateMaxHeartRate());
		System.out.println("Target Heart Range: " + heartRate.calculateTargetHeartRate() + " bpm");
		
		scanner.close();
	}
}
