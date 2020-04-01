package com.example.bank;

public class BadWithdrawalAmountException extends Exception {

	public BadWithdrawalAmountException(String message) {
		super(message);
	}
}
