package com.example.overloading;

public class OverloadTest {

	public static void main(String[] args) {
		BasicOverloadedCalculator calculator = 
				new BasicOverloadedCalculator();
		
		System.out.println(calculator.multiply(12, 21));
		System.out.println(calculator.multiply(2, 4, 7));
		System.out.println(calculator.multiply(2.7, 3.1));
		System.out.println(calculator.multiply(2, 3, 5, 6));		
		System.out.println(calculator.multiply(2, 3, 5, 6, 7));
	}
}
