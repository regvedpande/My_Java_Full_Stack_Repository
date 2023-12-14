package com.mkpits.controlflowstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
	

	public static void main (String []args) throws NumberFormatException, IOException {
		
		int i, fact=1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter the Number");
	    int number = Integer.parseInt(br.readLine());
	    for ( i = 1; i<=number;i++) {
	    	fact*= i;
	   
	    }
	    System.out.println("Factorial of :"+number+" is:" +fact);
		

	}
}
