package com.mkpits.collectionframeworks;

import java.util.ArrayList;

interface set {

	void abstraction(int s);

}

public class ParametersInLambdaExpression {

	public static void main(String[] args) {

		ArrayList<String> sentences = new ArrayList<String>();
		sentences.add("Welcome to Java");
		sentences.add("Pranav is the best programmer in Java");

		set words = (int s) -> System.out.println(s * 10);

		words.abstraction(10);

		sentences.forEach(n -> System.out.println(sentences.get(1)));
		sentences.forEach(n -> System.out.println(n));
		sentences.forEach(System.out::println);
	}

}
