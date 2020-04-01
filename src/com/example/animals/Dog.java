package com.example.animals;

public class Dog extends Animal {

	private double loyaltyIndex;

	public Dog(String name, String colour, String breed, int numberOfLegs, 
			boolean hasTail, double weight,
			double loyaltyIndex) {
		super(name, colour, breed, numberOfLegs, hasTail, weight);
		this.loyaltyIndex = loyaltyIndex;
	}

	public void pant() {
		System.out.println(getName() + " is panting");
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + " is barking");
	}
	
	@Override
	public String toString() {
		String output = super.toString();
		
		output += "\nLoyalty Index: " + this.loyaltyIndex;
		
		return output;
	}

	/**
	 * @return the loyaltyIndex
	 */
	public double getLoyaltyIndex() {
		return loyaltyIndex;
	}

	/**
	 * @param loyaltyIndex the loyaltyIndex to set
	 */
	public void setLoyaltyIndex(double loyaltyIndex) {
		this.loyaltyIndex = loyaltyIndex;
	}
}
