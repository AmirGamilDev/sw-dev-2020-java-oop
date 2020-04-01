package com.example.shapes;

public abstract class Shape {

	private String colour;
	
	public Shape(String colour) {
		this.colour = colour;
	}

	public abstract double getArea();
	
	@Override
	public String toString() {
		return "[colour = " + colour + "]";
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
