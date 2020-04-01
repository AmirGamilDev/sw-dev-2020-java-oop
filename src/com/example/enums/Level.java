package com.example.enums;

public enum Level {

	LEVEL1(12),
	LEVEL2(15),
	LEVEL3(25);
	
	private final int rate;
	
	Level(int rate) {
		this.rate = rate;
	}

	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}
}
