package com.jcx.main;

import com.jcx.domain.Account;

public class AccountMain {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccountNumber(101);
		account1.setName("Vivek");
		account1.setBalance(1000);

		System.out.println("Account Number = " + account1.getAccountNumber());
		System.out.println("Name = " + account1.getName());
		System.out.println("Balance = " + account1.getBalance());

		System.out.println("withdraw : 700");
		boolean result = account1.withdraw(700);

		if (result == true) {
			System.out.println("Transaction completed successfully!");
			System.out.println("Balance = " + account1.getBalance());
		} else {
			System.out.println("Transaction Failed!");
			System.out.println("Balance = " + account1.getBalance());
		}

		System.out.println();

		System.out.println("Deposit : 300");

		result = account1.deposit(300);

		if (result == true) {
			System.out.println("Deposit completed successfully!");
			System.out.println("Balance = " + account1.getBalance());
		} else {
			System.out.println("Deposit Failed!");
			System.out.println("Balance = " + account1.getBalance());
		}

		System.out.println("================================");
		Account account2 = new Account();
		account2.setAccountNumber(102);
		account2.setName("Abhijeet");
		account2.setBalance(1000);

		System.out.println("Account Number = " + account2.getAccountNumber());
		System.out.println("Name = " + account2.getName());
		System.out.println("Balance = " + account2.getBalance());
	}

}
