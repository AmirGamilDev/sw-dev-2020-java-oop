package com.example.shapes;

public class Rectangle extends Shape {

	private double width;
	private double length;
	
	public Rectangle(String colour,
			double width, double length) {
		super(colour);
		
		this.width = width;
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}
	
	@Override
	public String toString() {
		return "Rectangle: " + super.toString() + "\nWidth = " + width
				+ "\nLength = " + length;
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

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
}
