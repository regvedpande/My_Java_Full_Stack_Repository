package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileLoop {
	
	// Variables Declaration because we want them global to access them anywhere throughout the code
	String c;
	private String name;
	private String email;
	private int accountNumber;
	private String ifsc;
	
	static BufferedReader br; // We use it as global instead of inside main because we want to access it anywhere from throughout the class 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		WhileLoop out = new WhileLoop(); // Created object to access it like (objectname.method name)
		br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch = 'Y'; // The reason we use Y and y is that the user can only give responses in the form of yes, which is Y or y, that's why there is ||
		
		while (ch == 'y' || ch == 'Y') {
			
			System.out.println("Enter Your Choice\n1. Create Account\n2. Account Details"); // For print screen
			int choice = Integer.parseInt(br.readLine()); // Converting our string input of global to int as the value is int
			
			switch (choice) {
				case 1:
					out.createAccount();
					break; // After this code will not execute other blocks

				case 2:
					out.accountDetails();
					break;

				default:
					System.out.println("Invalid Choice");
					break;
			}
		    
			System.out.println("Do You wish to Continue ? Y/N"); // It will run on and on with Y or y until you stop like entering any other digit than them 
			ch = (char) br.read();
			br.readLine();
		}
	}

	private void accountDetails() {
		// Displaying account details
		System.out.println("Account Holder Name :- " + name);
		System.out.println("Account Holder Email :- " + email);
		System.out.println("Account Number :- " + accountNumber);
		System.out.println("Account IFSC Code :- " + ifsc);
	}

	private void createAccount() throws IOException {
		// Creating an account by taking user input
		System.out.println("Enter Account Holder Name");
		name = br.readLine();
		
		System.out.println("Enter Email");
		email = br.readLine();
		
		accountNumber = (int) Math.floor(Math.random() * 1000000); // Generating a random account number
		System.out.println("Account Created");
		
		ifsc = "SBIN00" + accountNumber; // Creating IFSC code based on the generated account number
	}
}


	