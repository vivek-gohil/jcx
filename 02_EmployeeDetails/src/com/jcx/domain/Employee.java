package com.jcx.domain;

import java.util.Scanner;

public class Employee {

	private int employeeId;
	private String name;
	private double salary;

	public void acceptDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter EmployeeId");
		employeeId = scanner.nextInt();
		System.out.println("Enter name");
		name = scanner.next();
		System.out.println("Enter salary");
		salary = scanner.nextDouble();
	}

	public void printDetails() {
		System.out.println("EmployeeId = " + employeeId);
		System.out.println("Name = " + name);
		System.out.println("Salary  = " + salary);
	}

}
