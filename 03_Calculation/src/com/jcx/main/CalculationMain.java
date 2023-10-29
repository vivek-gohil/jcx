package com.jcx.main;

import java.util.Scanner;

import com.jcx.domain.Calculator;

public class CalculationMain {

	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		System.out.println("main start");

		System.out.println("Menu");
		System.out.println("1. Addition");
		System.out.println("2. Multiplication");
		System.out.println("3. Subtraction");
		System.out.println("4. Division");
		System.out.println("Enter your choice");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			calculator.accept();
			calculator.addition();
			break;
		case 2:
			calculator.accept();
			calculator.multiplicaiton();
			break;
		case 3:
			calculator.accept();
			calculator.subtraction();
			break;
		case 4:
			calculator.accept();
			calculator.division();
			break;
		default:
			System.out.println("Please select valid option");
			break;
		}
		calculator.display();

		System.out.println("main end");
	}

}
