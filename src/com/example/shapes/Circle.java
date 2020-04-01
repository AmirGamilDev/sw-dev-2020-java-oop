package com.example.shapes;

public class Circle extends Shape {

	private double radius;
	
	public Circle(String colour, double radius) {
		super(colour);
		
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle: " + super.toString() + "\nRadius = " + radius;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
