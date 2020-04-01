package com.example.delph;

public class Cup {

	private String colour;
	private double capacity;
	
	public Cup(String col, double cap) {
		this.colour = col;
		this.capacity = cap;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public void setColour(String c) {
		this.colour = c;
	}
	
	public double getCapacity() {
		return this.capacity;
	}
	
	public void setCapacity(double cap) {
		this.capacity = cap;
	}
	
}
