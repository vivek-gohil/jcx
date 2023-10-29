package com.jcx.main;

import com.jcx.domain.Calculations;

public class CalculationsMain {

	public static void main(String args[]) {
		System.out.println("main start");

		Calculations calculationsObject = new Calculations();

		System.out.println("Addition = " + calculationsObject.addition(10, 20));
		System.out.println("Multiplication = " + calculationsObject.multiplicaiton(10, 2));

		System.out.println("main end");
	}
}
