package com.meritamerica.assignment1;
public class SavingsAccount {
	private double balance;
	private double interestRate = 0.001;
	// add constructor
	public SavingsAccount(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public double futureValue(int years) {
		
		double factor = 1.01;
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
		return "SavingsAccount [balance=" + balance + ", interestRate=" + interestRate + ", futureValue(3)="
				+ futureValue(3) + "]";
	}
}