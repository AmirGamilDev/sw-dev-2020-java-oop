package com.example.vehicles;

public class Car extends Vehicle {

	public Car(int numberOfWheels, String colour) {
		super(numberOfWheels, colour);
	}
	
	@Override
	public void move() {
		System.out.println("Car is moving");
	}
	
	@Override
	public void stop() {
		System.out.println("Car has stopped");
	}
	
	public void startEngine() {
		System.out.println("Car engine has started");
	}
}
