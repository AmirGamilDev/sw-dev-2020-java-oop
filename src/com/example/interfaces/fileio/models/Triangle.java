package com.example.interfaces.fileio.models;

public class Triangle extends Shape {

	private static final long serialVersionUID = 4L;

	private double base;
	private double side2;
	private double side3;
	private double height;
	
	public Triangle(String colour,
			double base, double side2, double side3,
			double height) {
		super(colour);
		
		this.base = base;;
		this.side2 = side2;
		this.side3 = side3;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (base * height) / 2.0;
	}
	
	@Override
	public String toString() {
		return "Triangle: " + super.toString() + "\nBase = " + base
				+ "\nSide 2 = " + side2
				+ "\nSide 3 = " + side3
				+ "\nHeight = " + height;
	}
	
	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the side2
	 */
	public double getSide2() {
		return side2;
	}

	/**
	 * @param side2 the side2 to set
	 */
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	/**
	 * @return the side3
	 */
	public double getSide3() {
		return side3;
	}

	/**
	 * @param side3 the side3 to set
	 */
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
}
