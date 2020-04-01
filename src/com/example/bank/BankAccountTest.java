package com.example.bank;

public class BankAccountTest {

	public static void main(String[] args) throws BadWithdrawalAmountException {
		BankAccount amirsAccount = new BankAccount(12345678, "Amir Gamil", 200);
		
		displayAccountInfo(amirsAccount);
		
		amirsAccount.deposit(153.30);
		
		displayAccountInfo(amirsAccount);
		
		try {
			amirsAccount.withdrawal(100);
		} catch (BadWithdrawalAmountException e) {
			System.out.println("Caught illegal argument - we should do something about it here");
			
			throw e;
		}
		
		displayAccountInfo(amirsAccount);
		
		try {
			amirsAccount.withdrawal(500);
		} catch(BadWithdrawalAmountException ex) {
			System.out.println("Caught illegal argument - we should do something about it here");
		}
		
		displayAccountInfo(amirsAccount);
	}
	
	public static void displayAccountInfo(BankAccount bankAccount) {
		String output = String.format("Account info:" 
				+ "\nAccount Number: %d" 
				+ "\nAccount name: %s" 
				+ "\nBalance: �%.2f", 
				bankAccount.getAccountNumber(), 
				bankAccount.getName(), 
				bankAccount.getBalance());
		
		System.out.println(output);
	}
}
