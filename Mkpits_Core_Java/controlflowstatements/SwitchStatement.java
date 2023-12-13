package com.mkpits.controlflowstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchStatement {

	public static void main(String []args) throws NumberFormatException, IOException {
		
		SwitchStatement out = new SwitchStatement();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int choice =Integer.parseInt(br.readLine());
		
		
		
		
		switch (choice) {
		case 1:
			System.out.println("Name");
		     out.createName();
			break;
			
		case 2:
			System.out.println("Number");
			 out.createNumber();

			break;
			
		case 3:
			System.out.println("Age");
			 out.createAge();
			break;
			
		case 4:
			System.out.println("ID");
			 out.createId();

			break;
			
		case 5:
			System.out.println("Star Sign");
			 out.createStarSign();
		
			break;

		default:
			
			break;
		}
		
	}
	public void createName() {
		
		System.out.println("Regved Pande");
		
		
	}
	
	public void createNumber() {
	
		System.out.println("9049874883");
		
	}
	
	public void createAge() {
		
		System.out.println("22");
		
		
	}
	
	public void createId() {
		
		System.out.println("11902027");
		
		
	}
	
	public void createStarSign() {
		
		System.out.println("Leo");
		
	}
}
