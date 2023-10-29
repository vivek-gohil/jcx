package com.jcx.main;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1, number2, number3;

		System.out.println("Enter number1");
		number1 = scanner.nextInt();
		System.out.println("Enter number2");
		number2 = scanner.nextInt();
		System.out.println("Enter number3");
		number3 = scanner.nextInt();

		if (number1 > number2 && number1 > number3) {
			System.out.println(number1);
		}
		if (number2 > number1 && number2 > number3) {
			System.out.println(number2);
		} else
			System.out.println(number3);

	}

}
