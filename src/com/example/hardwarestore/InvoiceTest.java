package com.example.hardwarestore;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice myInvoice = new Invoice("1234", "Box of nails", 5, 2);
		Invoice myInvoice2 = new Invoice("1235", "Box of screws", -5, 2);
		Invoice myInvoice3 = new Invoice("1236", "Box of washers", 5, -2);
		Invoice myInvoice4 = new Invoice("1237", "Fork handles", -5, -2);
		
		displayInvoice(myInvoice);
		displayInvoice(myInvoice2);
		displayInvoice(myInvoice3);
		displayInvoice(myInvoice4);
	}
	
	static void displayInvoice(Invoice invoice) {
		String output = String.format("Purchase details:"
				+ "\nPart number: %s"
				+ "\nDescription: %s"
				+ "\nQuantity: %d"
				+ "\nPrice per item: %.2f"
				+ "\nInvoice Total: %.2f",
				invoice.getPartNumber(),
				invoice.getDescription(),
				invoice.getQuantity(),
				invoice.getPrice(),
				invoice.getInvoiceAmount());
		
		System.out.println(output);
	}
}
