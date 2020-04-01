package com.example.interfaces;

import java.util.ArrayList;
import java.util.List;

public class PayTest {

	public static void main(String[] args) {
		Employee joeBloggs = new Employee("Joe", "Bloggs");
		Company sega = new Company("Sega");
		
		joeBloggs.pay(200);
		sega.pay(100000);
		
		System.out.println();
		
		List<Payable> payables = new ArrayList<Payable>();
		
		payables.add(joeBloggs);
		payables.add(sega);
		
		for(Payable p : payables) {
			payEntity(p, 500);
		}
	}
	
	static void payEntity(Payable payable, double amount) {
		payable.pay(amount);
	}
}
