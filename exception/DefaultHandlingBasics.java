package com.mkpits.exception;

public class DefaultHandlingBasics {

	public static void main(String[] args) {

		// Default Exception is handled by Compiler
		int a = 5;
		int b = 6;
		int sum = a + b;
		System.out.println(sum);

		int division = sum / 0;
		System.out.println(division); // It would show Arithmetic Exception

		// Default Exception is given by GRE

	}
}