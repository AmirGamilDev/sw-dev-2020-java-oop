package com.example.vehicles;

public class Bicyle extends Vehicle {

	public Bicyle(int numberOfWheels, String colour) {
		super(numberOfWheels, colour);
	}

	@Override
	public void move() {
		System.out.println("Bicycle is moving");
		
	}

	@Override
	public void stop() {
		System.out.println("Bicycle has stopped");
	}
}
