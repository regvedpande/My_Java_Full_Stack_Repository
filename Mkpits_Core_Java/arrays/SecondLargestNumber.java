package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int numbers[] = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Array: ");

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = Integer.parseInt(br.readLine());

		}

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < 10 && numbers[i] > 8 || numbers[i] < 10 && numbers[i] > 8
					|| numbers[i] < 10 && numbers[i] > 8) {
				System.out.println("Second Largest Number is ");

			} else {

			}
		}
	}
}
