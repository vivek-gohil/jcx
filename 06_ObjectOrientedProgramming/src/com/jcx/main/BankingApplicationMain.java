package com.jcx.main;

import java.util.Scanner;

import com.jcx.domain.Account;

public class BankingApplicationMain {

	public static void main(String[] args) {
		int accountNumber;
		String name;
		double balance;
		int choice;
		int amount;
		boolean result;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter account number");
		accountNumber = scanner.nextInt();

		System.out.println("Enter name");
		name = scanner.next();

		System.out.println("Enter balance");
		balance = scanner.nextDouble();

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setName(name);
		account.setBalance(balance);

		System.out.println("Account opened successfully!");
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println("Menu");
		System.out.println("Press 1 for withdraw");
		System.out.println("Press 2 for deposit");
		System.out.println("Press 3 for check balance");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter amount to withdraw");
			amount = scanner.nextInt();

			result = account.withdraw(amount);
			if (result == true) {
				System.out.println("Withdraw successfull!");
				System.out.println("Updated Balance = " + account.getBalance());
			} else {
				System.out.println("Withdraw failed!");
				System.out.println("Updated Balance = " + account.getBalance());
			}
			break;
		case 2:
			break;
		case 3:
			break;
		}

	}

}
