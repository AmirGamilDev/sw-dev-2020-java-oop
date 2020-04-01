package com.example.hardwarestore;

public class Invoice {

	private String partNumber;
	private String description;
	private int quantity;
	private double price;
	
	public Invoice(String pn, String d, int quan, double price) {
		this.partNumber = pn;
		this.description = d;
		this.quantity = quan;
		this.price = price;
		
		if(this.quantity < 0) {
			this.quantity = 0;
		}
		
		if(this.price < 0) {
			this.price = 0;
		}
	}
	
	public double getInvoiceAmount() {
		return quantity * price;
	}

	/**
	 * @return the partNumber
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * @param partNumber the partNumber to set
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
}
