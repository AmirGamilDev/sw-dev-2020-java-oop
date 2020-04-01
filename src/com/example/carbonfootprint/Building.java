package com.example.carbonfootprint;

public class Building implements CarbonFootprint {

	private double monthlyKwh;
	private double monthlyGas;
	
	public Building(double monthlyKwh, double gas) {
		super();
		this.monthlyKwh = monthlyKwh;
		this.monthlyGas = gas;
	}

	@Override
	public double getCarbonFootprint() {
		return (monthlyKwh * 0.4483 * 12) 
				+ (monthlyGas * 0.185 * 12);
	}
	
	@Override
	public String toString() {
		return "Building [monthlyKwh=" + monthlyKwh + ", gas=" + monthlyGas + "]";
	}

	/**
	 * @return the monthlyKwh
	 */
	public double getMonthlyKwh() {
		return monthlyKwh;
	}

	/**
	 * @param monthlyKwh the monthlyKwh to set
	 */
	public void setMonthlyKwh(double monthlyKwh) {
		this.monthlyKwh = monthlyKwh;
	}

	/**
	 * @return the gas
	 */
	public double getGas() {
		return monthlyGas;
	}

	/**
	 * @param gas the gas to set
	 */
	public void setGas(double gas) {
		this.monthlyGas = gas;
	}
}
