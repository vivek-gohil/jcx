package com.jcx.main;

import java.util.Scanner;

public class AdditionMain {

	public static void main(String[] args) {
		System.out.println("main start");

		int n1, n2, result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		n1 = scanner.nextInt();
		System.out.println("Enter second number");
		n2 = scanner.nextInt();
		AdditionMain addition = new AdditionMain();
		result = addition.add(n1, n2);
		System.out.println("Result ::  " + result);
		System.out.println("main end");
	}

	public int add(int number1, int number2) {
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		return number1 + number2;
	}

}
