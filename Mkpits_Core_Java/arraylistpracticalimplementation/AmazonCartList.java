package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AmazonCartList {
	public static void main(String[] args) throws IOException {

		ArrayList<String> cart = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Items you want to add: ");

		for (int i = 0; i < 4; i++) {

			String basket = br.readLine();
			cart.add(basket);

		}

		for (String string : cart) {

			System.out.println("Items in your Cart are:" + string);

		}

		System.out.println("Enter the Items you want to remove: ");
		String removeditems = br.readLine();
		cart.remove(removeditems);

		System.out.println("Enter the Items you want to add");
		String additems = br.readLine();
		cart.add(additems);

		for (String string : cart) {

			System.out.println(string);

		}

//		for (int i = cart.size() - 1; i >= 0; i--) {
//			System.out.println(cart.get(i));
//
//		}
//		Collections.reverse(cart);
//
//		System.out.println("Items in your cart (reversed):");
//		for (String item : cart) {
//			System.out.println(item);
//		}

	}
}
