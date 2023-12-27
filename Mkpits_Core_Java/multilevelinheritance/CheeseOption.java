package com.mkpits.multipleinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheeseOption extends Toppings {

	void cheeseoption() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Cheese Option : 1)No Cheese 2)Extra Cheese ");
		int cheeseoption = Integer.parseInt(br.readLine());

		switch (cheeseoption) {
		case 1:
			System.out.println("No Cheese");
			break;

		case 2:
			System.out.println("Extra Cheese");
			break;
		}
	}

	void result() {
		System.out.println("Your Pizza is ready");
	}

}
