package com.jcx.main;

import com.jcx.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("main start");

		Employee employeeObject = new Employee();
		employeeObject.setEmployeeId(1001);
		employeeObject.setName("Shubham");
		employeeObject.setSalary(50000);

		System.out.println(employeeObject.getEmployeeId());
		System.out.println(employeeObject.getName());
		System.out.println(employeeObject.getSalary());

		System.out.println("==========================================");
		
		Employee employeeObject2 = new Employee();
		employeeObject2.setEmployeeId(1002);
		employeeObject2.setName("Pradnya");
		employeeObject2.setSalary(50000);

		System.out.println(employeeObject2.getEmployeeId());
		System.out.println(employeeObject2.getName());
		System.out.println(employeeObject2.getSalary());

		System.out.println("main end");
	}

}
