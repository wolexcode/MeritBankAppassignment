package com.meritamerica.assignment1;
public class MeritAmericaBankApp {
	public static void main(String[] args) {
		
		
		//Instantiate an account holder with balance of $100 in checkings & $1000 in savings
		AccountHolder acc1 = new AccountHolder("John", "James", "Doe", "123-45-6789", 100.00, 1000.00);
		// Display account holder's toString
		System.out.println(acc1);
		//Deposit $500 into checking account
		acc1.getCheckingAccount().deposit(500.0);
		
		//Withdraw $800 from savings account
		acc1.getSavingsAccount().withdraw(800.0);
		
		//Display checking account toString output
		System.out.println(acc1.getCheckingAccount());
		
		//Display savings account toString output
		System.out.println(acc1.getSavingsAccount());
		
		//Instantiate another account holder with $200 in checking and $500 in savings
		AccountHolder acc2 = new AccountHolder("Paul", "Derek", "Jones", "987-65-4321", 200.00, 500.00);
		
		//Deposit -$500 into checking account
		acc2.getCheckingAccount().deposit(-500.0);
		
		//Withdraw $600 from savings
		acc2.getSavingsAccount().withdraw(600);
		
		// Display second account holder's toString
		System.out.println(acc2);
	
	}
}