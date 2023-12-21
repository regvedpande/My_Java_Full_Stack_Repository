package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleInheritance extends ChildClass {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ChildClass child = new ChildClass();

		System.out.println("Enter First Name :");
		String firstname = br.readLine();
		child.getFirstName(firstname);

		System.out.println("Enter Last Name :");
		String lastname = br.readLine();
		child.getLastName(lastname);

		System.out.println("Enter Email :");
		String email = br.readLine();
		child.getEmail(email);

		System.out.println("Enter Mobile Number :");
		long mobile = Long.parseLong(br.readLine());
		child.getMobile(mobile);

		System.out.println("Enter Gender :");
		String gender = br.readLine();
		child.getGender(gender);

		System.out.println("Enter PinCode :");
		int pincode = Integer.parseInt(br.readLine());
		child.getPinCode(pincode);

		child.getAllDetails();
	}

}
