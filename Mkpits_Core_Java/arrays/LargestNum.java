package com.mkpits.array;

public class LargestNum {

	public static void main(String[] args) {

		int numbers[] = { 1, 4, 30, 2, 5 };

		int largest = 0;

		for (int i = 0; i < numbers.length; i++) {
			// largest = numbers[i] ;

			if (largest > numbers[i]) {
				largest = largest;
			} else {

				largest = numbers[i];
			}

		}
		System.out.println(largest);
	}
}
