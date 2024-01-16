package com.mkpits.exception;

public class PurchasedCarException extends Exception {

	int purchasedCar[];

	public PurchasedCarException() {

		System.out.println("Default Constructor is Called");
	}

	@Override
	public String toString() {
		return "Invalid Choice";
	}

}
