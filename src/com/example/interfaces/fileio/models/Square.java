package com.example.interfaces.fileio.models;

public class Square extends Shape {

	private static final long serialVersionUID = 3L;

	private double width;
	
	public Square(String colour, double width) {
		super(colour);
		this.width = width;
	}

	@Override
	public double getArea() {
		return width * width;
	}
	
	@Override
	public String toString() {
		String output = "Square: " + super.toString();
		
		output += "\nWidth = " + width;
		
		return output;
		
		// equivalent to
		//return super.toString() + "\nWidth = " + width;
	}
	
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
}
