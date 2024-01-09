package com.mkpits.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SearchingofNumber {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		int num1 = method1(2, 1);
		int num2 = method2(3, 4);
		System.out.println(method3(num1, num2));
	}

	public static int method1(int a, int b) {
		return a + b;
	}

	public static int method2(int a1, int b1) {
		return a1 + b1;

	}

	public static int method3(int num1, int num2) {
		return num1 + num2;
	}

}
