package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTheNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number : ");
		int number = Integer.parseInt(br.readLine());
		int result, sum = 0;

		// Extracting and printing each individual digit of the number in reverse order
		// (e.g., 123 -> 321)
		// The loop continues until the number becomes '0'
		for (int i = 1; number > 0; i++) {

			// Calculating the remainder when the number is divided by 10
			result = number % 10;

			// Printing the remainder (individual digit)
			// System.out.println(result);

			sum += result;
			System.out.println(sum); // The value gets repeated here

			// Dividing the number by 10 to move on to the next digit
			number = number / 10;

		}

		System.out.println(sum); // you can also print it outside the loop to avoid repeatation

	}

}