package com.example.carbonfootprint;

public class Car implements CarbonFootprint {

	private String type;
	private int topSpeed;
	private boolean petrol;
	private double consumption;
	
	public Car(String type, int topSpeed, boolean petrol, 
			double consumption) {
		super();
		this.type = type;
		this.topSpeed = topSpeed;
		this.petrol = petrol;
		this.consumption = consumption;
	}
	
	@Override
	public double getCarbonFootprint() {
		if(petrol) {
			return consumption * 2.39;
		} else {
			return consumption * 2.16;
		}
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the topSpeed
	 */
	public int getTopSpeed() {
		return topSpeed;
	}

	/**
	 * @param topSpeed the topSpeed to set
	 */
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	/**
	 * @return the petrol
	 */
	public boolean isPetrol() {
		return petrol;
	}

	/**
	 * @param petrol the petrol to set
	 */
	public void setPetrol(boolean petrol) {
		this.petrol = petrol;
	}
	
	/**
	 * @return the consumption
	 */
	public double getConsumption() {
		return consumption;
	}

	/**
	 * @param consumption the consumption to set
	 */
	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", topSpeed=" + topSpeed + ", petrol=" + petrol + ", consumption=" + consumption
				+ "]";
	}
}
