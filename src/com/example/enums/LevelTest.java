package com.example.enums;

public class LevelTest {

	public static void main(String[] args) {
		Level myLevel = Level.LEVEL1;
				
		switch(myLevel) {
		case LEVEL1:
			System.out.println("This is level 1 - " 
					+ "Rate: " + myLevel.getRate());
			break;
		case LEVEL2:
			System.out.println("This is level 2 - " 
					+ "Rate: " + myLevel.getRate());
			break;
		case LEVEL3:
			System.out.println("This is level 3 - " 
					+ "Rate: " + myLevel.getRate());
			break;
		default:
			break;
		
		}
	}
}
