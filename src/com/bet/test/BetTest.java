package com.bet.test;

import java.util.ArrayList;
import java.util.List;

import com.bet.companies.ContractingCompany;
import com.bet.payments.Payable;
import com.bet.people.Staff;
import com.bet.people.Student;
import com.bet.people.Tutor;

public class BetTest {

	public static void main(String[] args) {
		Student student1 = new Student("Joe", "Bloggs", 
				"001", "7540", "Software Developer");
		
		Staff staff1 = new Staff("Jack", "Olley", 
				111, "Programmer");
		
		Tutor tutor1 = new Tutor("Dave", "Gary",
				222, "Tutor", "Java");
		
		List<Integer> courseIds = new ArrayList<Integer>();
		
		courseIds.add(7540);
		courseIds.add(4520);
		
		ContractingCompany contractingCompany = 
				new ContractingCompany(909, "GenCom", courseIds);
		
		List<Payable> payables = new ArrayList<Payable>();
		
		payables.add(student1);
		payables.add(staff1);
		payables.add(tutor1);
		payables.add(contractingCompany);
		
		for(Payable p : payables) {
			p.pay(500);
		}
	}
}
