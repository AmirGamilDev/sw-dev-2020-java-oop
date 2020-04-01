package com.example.overloading;

public class BasicOverloadedCalculator {

	public int multiply(int x, int y) {
		System.out.println("In multiply 2 ints");
		
		return x * y;
	}
	
	public int multiply(int x, int y, int z) {
		System.out.println("In multiply 3 ints");
		
		return x * y * z;
	}
	
	public double multiply(double x, double y) {
		System.out.println("In multiply 2 doubles");
		
		return x * y;
	}
	
	public double multiply(int... ints) {
		System.out.println("in multiply var args");
		
		double totalNum = 1;
		
		for(int i : ints) {
			totalNum *= i;
		}
		
		return totalNum;
	}
	
}
