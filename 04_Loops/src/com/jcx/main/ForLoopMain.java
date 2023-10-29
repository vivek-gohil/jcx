package com.jcx.main;

import java.util.Scanner;

public class ForLoopMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = scanner.nextInt();

		System.out.println("For loop");
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + i * number);
		}
	}
}
