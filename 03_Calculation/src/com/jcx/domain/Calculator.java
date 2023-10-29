package com.jcx.domain;

import java.util.Scanner;

public class Calculator {
	private double number1;
	private double number2;
	private double result;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number");
		number1 = scanner.nextDouble();
		System.out.println("Enter Second Number");
		number2 = scanner.nextDouble();
	}

	public void addition() {
		result = number1 + number2;
	}

	public void multiplicaiton() {
		result = number1 * number2;
	}

	public void division() {
		result = number1 / number2;
	}

	public void subtraction() {
		result = number1 - number2;
	}

	public void display() {
		System.out.println("Result = " + result);
	}
}
