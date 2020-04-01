package com.example.animals;

public class Animal {

	private String name;
	private String colour;
	private String breed;
	private int numberOfLegs;
	private boolean hasTail;
	private double weight;
	
	public Animal(String name, String colour, String breed, int numberOfLegs, boolean hasTail, double weight) {
		super();
		this.name = name;
		this.colour = colour;
		this.breed = breed;
		this.numberOfLegs = numberOfLegs;
		this.hasTail = hasTail;
		this.weight = weight;
	}

	public void eat() {
		System.out.println(this.name + " is eating");
	}
	
	public void sleep() {
		System.out.println(this.name + " is sleeping... ZZZZZZzzzz");
	}
	
	public void makeSound() {
		System.out.println(this.name + " is making a sound");
	}
	
	@Override
	public String toString() {
		String output = "Name: " + this.name;
		output += "\nColour: " + this.colour;
		output += "\nBreed: " + this.breed;
		output += "\nNumber of Legs: " + this.numberOfLegs;
		output += "\nHas tail: " + this.hasTail;
		output += "\nWeight: " + this.weight;		
		
		return output;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the numberOfLegs
	 */
	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	/**
	 * @param numberOfLegs the numberOfLegs to set
	 */
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	/**
	 * @return the hasTail
	 */
	public boolean isHasTail() {
		return hasTail;
	}

	/**
	 * @param hasTail the hasTail to set
	 */
	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
