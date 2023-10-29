package com.jcx.main;

import com.jcx.domain.Employee;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
		System.out.println("main start");

		Employee employee = new Employee();
		employee.acceptDetails();
		employee.printDetails();
		

		System.out.println("main end");
	}

}
