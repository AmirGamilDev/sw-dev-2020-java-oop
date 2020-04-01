package com.example.bank;

public class BankAccount {

	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdrawal(double withdrawalAmount) throws BadWithdrawalAmountException {
		if(withdrawalAmount > this.balance || withdrawalAmount < 0) {
			String message = "Withdrawal amount " + withdrawalAmount + " exceeds account balance";
			
//			System.out.println(message);
//			throw new IllegalArgumentException(message);
			throw new BadWithdrawalAmountException(message);
		} else {
			this.balance -= withdrawalAmount;
		}
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return this.balance;
	}
}
