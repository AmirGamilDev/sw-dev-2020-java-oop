package com.example.vehicles;

public class Trike extends Vehicle {

	public Trike(int numberOfWheels, String colour) {
		super(numberOfWheels, colour);
	}
	
	@Override
	public void move() {
		System.out.println("Trike is moving");
	}

	@Override
	public void stop() {
		System.out.println("Trike has stopped");
	}
	
}
