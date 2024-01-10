package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverse {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int n = Integer.parseInt(br.readLine());

		int number = 0;
		int remainder;

		while (n > 0) {

			remainder = n % 10;
			number = number * 10 + remainder;
			n = n / 10;

		}

		System.out.println("Reverse of the Number is " + number);
	}
}