package com.example.vehicles;

public abstract class Vehicle {

	private int numberOfWheels;
	private String colour;
	
	public Vehicle(int numberOfWheels, String colour) {
		this.numberOfWheels = numberOfWheels;
		this.colour = colour;
	}
	
	public abstract void move();
	
	public abstract void stop();
	
	@Override
	public String toString() {
		String output = "Number of wheels: " + this.numberOfWheels;
		output += "\nColour: " + this.colour;
		
		return output;
	}

	/**
	 * @return the numberOfWheels
	 */
	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	/**
	 * @param numberOfWheels the numberOfWheels to set
	 */
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	/**
	 * @return the colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * @param colour the colour to set
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}
}
