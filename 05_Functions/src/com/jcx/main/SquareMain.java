package com.jcx.main;

import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		int number, result;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to print square");
		number = scanner.nextInt();

		SquareMain object = new SquareMain();
		result = object.calculateSquare(number);

		System.out.println("Square of number is " + result);

	}

	// public = access specifier
	// int = return type
	// calculateSquare = function name
	// int number = parameters
	public int calculateSquare(int number) {
		System.out.println("In calculateSquare");
		int result = number * number;
		return result;
	}

}
