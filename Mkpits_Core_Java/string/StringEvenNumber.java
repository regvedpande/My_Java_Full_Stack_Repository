package com.mkpits.string;

public class StringEvenNumber {

	public static void main(String[] args) throws NumberFormatException {

		String sentence = "Pranav Doraemon Jiske Pass Bohot Saare Gadgets Hai";

		/*
		 * Splits the above sentence into list of words (4) and then add them to the
		 * indexing below in for loop
		 */

		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++) {
			String currentword = words[i];

			if (currentword.length() % 2 == 0) {
				System.out.println("Even length word: " + currentword);
			}
		}
	}
}