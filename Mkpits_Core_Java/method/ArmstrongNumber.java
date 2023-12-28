package com.mkpits.method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmstrongNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome ArmStrong Number");
		System.out.println("Enter any 3 digit no");
		int a = Integer.parseInt(br.readLine());
		int sum = 0, rem;
		int q = a;

		// Iterative
		while (q != 0) {
			rem = q % 10;
			sum = ((int) Math.pow(rem, 3)) + sum;
			q = q / 10;
		}

		// Control Flow or Conditional
		if (a == sum) {
			System.out.println("This is Armstrong Number ");
		} else
			System.out.println("This is not an Armstrong Number");
	}
}
