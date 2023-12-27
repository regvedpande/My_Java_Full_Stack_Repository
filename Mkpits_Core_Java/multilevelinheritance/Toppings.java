package com.mkpits.multipleinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Father Class

class Toppings extends Pizza {

	void toppingsmenu() throws NumberFormatException, IOException {

		String[] toppings = { "Capsicum", "Tomatoes", "Paneer", "Bell Pepper", "Mushroom" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What  do you want for Toppings : 1)Capsicum 2)Tomatoes 3)Paneer 4)Bell Pepper 5) Mushroom");
		int choiceoftoppings = Integer.parseInt(br.readLine());

		switch (choiceoftoppings) {

		case 1:
			System.out.println("Capsicum");
			break;

		case 2:
			System.out.println("Tomatoes");
			break;

		case 3:
			System.out.println("Paneer");
			break;

		case 4:
			System.out.println("Bell Pepper");
			break;

		case 5:
			System.out.println("Mushroom");
			break;
		}
	}
}