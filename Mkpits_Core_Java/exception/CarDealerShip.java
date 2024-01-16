package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CarDealerShip {

	public static void main(String[] args) {

		String carList[] = { "Porche 911 GT3 RS", "Bentley Bentyaga", "Mercedes Benz GT R", "Toyota Supra", "BMW M5" };
		int purchasedCar;
//		int temp = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char ch1 = 'n';
		while (ch1 == 'n') {
			try {
				System.out.println(
						"Enter the Car you want to buy : \n 1)Porche 911 GT3 RS \n 2)Bentley Bentyaga \n 3)Mercedes Benz GT R \n 4)Toyota Supra \n 5)BMW M5 ");
				int choice = Integer.parseInt(br.readLine());
				if (choice < 1) {
					System.out.println("Invalid Choice");
				} else {

					switch (choice) {
					case 1:
						System.out.println("1) Porche 911 GT3 RS");
						break;

					case 2:
						System.out.println("2)Bentley Bentyaga");
						break;

					case 3:
						System.out.println("3)Mercedes Benz GT R");
						break;

					case 4:
						System.out.println("4)Toyota Supra");
						break;

					case 5:
						System.out.println("5)BMW M5");
						break;

					default:
						break;

					}

					System.out.println("Do You Really Wish to Buy it : ");
					ch1 = (char) br.read();
					br.readLine();

					if (ch1 == 'y' || ch1 == 'Y') {
						System.out.println(" Congratulations for your New Car");

					} else if (ch1 == 'n' || ch1 == 'N') {
						System.out.println("Sorry to let you go");
					} else if (ch1 != 'y' || ch1 != 'Y' || ch1 != 'n' || ch1 != 'N') {
						throw new PurchasedCarException();
					}

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}
