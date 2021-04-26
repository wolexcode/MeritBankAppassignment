package com.meritamerica.assignment1;
public class CheckingAccount {
	private double balance;
	private double interestRate = 0.0001;
	// add constructor
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public double futureValue(int years) {
	    
		double factor = 1.0001;
		return Math.pow(factor, years)* this.balance;
	}
	public boolean withdraw(double amount) {
		if (amount < 0 || amount > balance) {
			return false;
		} else {
			balance = balance - amount;
			return true;
		}
	}
	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			balance = balance + amount;
			return true;
	}
}
	@Override
	public String toString() {
		return "CheckingAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureValue(3)="
				+ futureValue(3) + "]";
	}
}  