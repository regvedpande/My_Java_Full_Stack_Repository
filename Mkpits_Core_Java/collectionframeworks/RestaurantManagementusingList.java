package com.mkpits.collectionframeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RestaurantManagementusingList {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Name the Customers

		List<String> customername = new ArrayList<String>();

		System.out.println("Welcome! to our Restaurant do you want to make any reservation : ");

		char ch = (char) br.read();
		br.readLine();

		if (ch == 'Y' || ch == 'y') {

			System.out.println("Welcome to our Restaurant");

		} else {

			System.out.println("Sorry we cannot help you");
		}

		System.out.println("How many people you have to make Reservation for : ");
		int store = Integer.parseInt(br.readLine());

		System.out.println("Can you please tell me your names : ");

		for (int i = 0; i < store; i++) {

			customername.add(br.readLine());

		}

		System.out.println("So your names are : " + customername);

		List<String> orderlist = new ArrayList<String>();
		orderlist.add("Pizza");
		orderlist.add("Burger");
		orderlist.add("Chicken");
		orderlist.add("Pulao");
		orderlist.add("Paneer Bhurji");
		orderlist.add("Noodles");
		orderlist.add("Dosa");
		orderlist.add("Hot Dog");
		orderlist.add("Dhokla");
		orderlist.add("Vada Pav");

		System.out.println("What would you like to Eat we have following options available : " + orderlist);

		List<String> orderitem = new ArrayList<>();
		for (int i = 0; i < store; i++) {

			System.out.println(customername.get(i) + " What would you like to Order");

			String choice = "Order";
			while (!choice.equalsIgnoreCase("End")) {
				String itemName = br.readLine();

				orderitem.add(itemName);
				choice = itemName;
			}

			orderitem.remove(orderitem.lastIndexOf("End"));
			System.out.println("Order of  " + customername.get(i) + " is " + orderitem);
			orderitem = new ArrayList<String>();

		}

	}

}
