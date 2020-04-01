package com.example.calculator;

public class BasicCalculatorTest {

	public static void main(String[] args) {
		BasicCalculator calculator = new BasicCalculator();
		
		System.out.println(calculator.add(3, 4));
		System.out.println(calculator.subtract(3, 4));
		System.out.println(calculator.multiply(3, 4));
		System.out.println();
		System.out.println(calculator.divide(3, 0));
		System.out.println(calculator.divide(3, 4));
	}
}
