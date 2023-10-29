package com.jcx.main;

public class FunctionsMain {

	public static void main(String[] args) {
		System.out.println("main start");

		// Creating object = obj
		FunctionsMain obj = new FunctionsMain();
		int n1 = 10;
		int n2 = 20;
		String message = "Hi";
		obj.show(n2, n1, message);

		System.out.println("main end");
	}

	// public = access specifier
	// void = return type
	// show = method/function name
	// number = parameters
	// number1 = parameters
	public void show(int number, int number2, String text) {
		System.out.println("We are in show()");
		System.out.println(number);//20
		System.out.println(number2);//10
		System.out.println(text);//Hi
	}

}
