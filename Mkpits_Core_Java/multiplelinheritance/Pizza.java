package com.mkpits.multipleinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizza {

	void measurements() throws NumberFormatException, IOException {

		Pizza size = new Pizza();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of your Pizza : 1)Small, 2)Medium, 3)Large ");
		int pizzachoice = Integer.parseInt(br.readLine());

		switch (pizzachoice) {
		case 1:
			System.out.println("Small");
			break;

		case 2:
			System.out.println("Medium");
			break;

		case 3:
			System.out.println("Large");
			break;

		}
	}
}
