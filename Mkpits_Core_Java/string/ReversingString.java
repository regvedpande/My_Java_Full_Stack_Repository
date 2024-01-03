package com.mkpits.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversingString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = " ";

		System.out.println("Enter the String: ");
		String word1 = br.readLine();

		for (int i = word1.length() - 1; i >= 0; i--) {

			char ch = word1.charAt(i); // extracts each character
			word = word + ch; // adds each character in front of the existing string
		}
		System.out.println("Reversed String is : " + word);

	}

}
