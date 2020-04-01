package com.example.inhertiance;

public class Child extends Parent {

	int b;
	
	public Child() {
		super();
		b = 27;
	}

	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	
	public int getTotalofAAndB() {
		return a + b;
	}
}
