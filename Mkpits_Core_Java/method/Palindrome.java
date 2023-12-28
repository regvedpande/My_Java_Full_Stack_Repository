package com.mkpits.method;

public class Palindrome {

	public static void main(String[] args) {

		int a = 1441;
		int q = a;
		int sum = 0;
		int remainder;

		while (a > 0) {

			int remainder = q % 10;
			int sum = q / n + remainder;
			System.out.println(sum);

		}

		if (q == a) {
			System.out.println("It is Palindrome Number");
		} else {
			System.out.println("It is not a Palindrome Number");
		}
	}
}