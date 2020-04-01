package com.example.interfaces.fileio.models;

import java.io.Serializable;

public abstract class Shape implements Serializable {

	private static final long serialVersionUID = 7782910534836706351L;
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
