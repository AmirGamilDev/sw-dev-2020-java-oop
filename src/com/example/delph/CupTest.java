package com.example.delph;

public class CupTest {

	public static void main(String[] args) {
		Cup cup1 = new Cup("White", 300);
		Cup cup2 = new Cup("Red", 500);
		
		System.out.println("cup1: " + cup1.getColour()
						+ " - " + cup1.getCapacity());
		
		System.out.println("cup2: " + cup2.getColour()
						+ " - " + cup2.getCapacity());
		
		cup1.setColour("Blue");
		cup2.setColour("Green");
		
		System.out.println("cup1: " + cup1.getColour()
						+ " - " + cup1.getCapacity());

		System.out.println("cup2: " + cup2.getColour()
						+ " - " + cup2.getCapacity());
	}
}
