package com.jcx.main;

import java.util.Scanner;

public class ConditionStatementMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		
		System.out.println("Enter your age");
		age = scanner.nextInt();
		
		if(age >= 18) {
			System.out.println("Valid age for voting!");
		}
		else {
			System.out.println("Please try next year");
		}
	}

}
