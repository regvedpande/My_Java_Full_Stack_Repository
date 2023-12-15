package com.mkpits.controlflowstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNaturalNumbersUsingForLoop {
	

	public static void main (String []args) throws NumberFormatException, IOException {
		
		int i, sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter the Number");
	    int number = Integer.parseInt(br.readLine()); //because we take input input in the form of string above
	    for ( i = 1; i<=number;i++) {
	    	sum+= i;
	   
	    }
	    System.out.println("Sum of :"+number+" is:" +sum);
		

	}
}
