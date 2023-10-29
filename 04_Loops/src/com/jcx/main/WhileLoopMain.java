package com.jcx.main;

import java.util.Scanner;

public class WhileLoopMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("While Loop");
		System.out.println("Enter Number");
		int number = scanner.nextInt();

		int i = 1;
		int sum = 0;

		while (i <= number) {
			System.out.println(i);
			sum = sum + i;
			System.out.println("Value of sum = " + sum);
			i = i + 1;
		}
		System.out.println();
		System.out.println("Outside of loop sum = " + sum);

	}

}
