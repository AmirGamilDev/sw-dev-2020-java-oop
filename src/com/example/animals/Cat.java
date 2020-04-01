package com.example.animals;

public class Cat extends Animal {

	private int numberOfWhiskers;

	public Cat(String name, String colour, String breed, int numberOfLegs, 
			boolean hasTail, double weight,
			int numberOfWhiskers) {
		super(name, colour, breed, numberOfLegs, hasTail, weight);
		this.numberOfWhiskers = numberOfWhiskers;
	}
	
	public void climb() {
		System.out.println(getName() + " is climbing");
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + " is meowing");
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		
		output += "\nNumber of whiskers: " + this.numberOfWhiskers;
		
		return output;
	}

	/**
	 * @return the numberOfWhiskers
	 */
	public int getNumberOfWhiskers() {
		return numberOfWhiskers;
	}

	/**
	 * @param numberOfWhiskers the numberOfWhiskers to set
	 */
	public void setNumberOfWhiskers(int numberOfWhiskers) {
		this.numberOfWhiskers = numberOfWhiskers;
	}
}
