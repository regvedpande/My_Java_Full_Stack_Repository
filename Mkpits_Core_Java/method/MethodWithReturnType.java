package com.mkpits.method;

public class MethodWithReturnType {

	public static int addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 23;
		int result = MethodWithReturnType.addNumbers(num1,num2);
		System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
	}
}