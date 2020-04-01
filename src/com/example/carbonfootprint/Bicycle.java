package com.example.carbonfootprint;

public class Bicycle implements CarbonFootprint {

	private final double KILOGRAMS_OF_CARBON = 0.005;
	
	private int km;

	public Bicycle(int km) {
		super();
		this.km = km;
	}
	
	@Override
	public double getCarbonFootprint() {
		return km * KILOGRAMS_OF_CARBON;
	}

	/**
	 * @return the km
	 */
	public int getKm() {
		return km;
	}

	/**
	 * @param km the km to set
	 */
	public void setKm(int km) {
		this.km = km;
	}

	/**
	 * @return the gRAMS_OF_CARBON
	 */
	public double getGRAMS_OF_CARBON() {
		return KILOGRAMS_OF_CARBON;
	}

	@Override
	public String toString() {
		return "Bicycle [GRAMS_OF_CARBON=" + KILOGRAMS_OF_CARBON + ", km=" + km + "]";
	}
}
