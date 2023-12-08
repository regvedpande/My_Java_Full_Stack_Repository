package com.mkpits.operators;

public class ArithmeticOperators {

	public static void main(String []args) {
		ArithmeticOperators a = new ArithmeticOperators();
		a.arithmeticAdditionPreIncrement();
		a.arithmeticAdditionPostIncrement();
		a.arithmeticAdditionPreDecrement();
		a.arithmeticAdditionPostDecrement();
		
		
		
	}
	
	private void arithmeticAdditionPreIncrement() {
		int num1 = 5;
		int num2 = 6;
		int result = num1 + num2;
		++result;
		System.out.println("Integer is :" +result);
	}
	
	private void arithmeticAdditionPostIncrement() {
		int num1 = 5;
		int num2 = 6;
		int result = num1 + num2;
		result++;
		System.out.println("Integer is :" +result);
	}
	
	private void arithmeticAdditionPostDecrement() {
		int num1 = 5;
		int num2 = 6;
		int result = num1 + num2;
		result--;
		System.out.println("Integer is :" +result);
	}
	
	private void arithmeticAdditionPreDecrement() {
		int num1 = 5;
		int num2 = 6;
		int result = num1 + num2;
		--result;
		System.out.println("Integer is :" +result);
	}
	
}
