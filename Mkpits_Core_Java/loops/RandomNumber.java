package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumber {

	
	
	public static void main(String []args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int random =(int) Math.floor(Math.random()*100);
		
		
		
		int attempt;
		
		
		for (attempt = 0; attempt < 10; attempt++) {
			
			System.out.println("Enter the Number");
			int n = Integer.parseInt(br.readLine());
			
			
			if(n > random) {
				System.out.println("Value is Greater than System Value");
			}
			
			if (n==random){

				System.out.println("Congratulations You Win");
				break;
				
			}
			if(n < random){
				
				System.out.println("Value is Less than Default Value");
		
			}
			
		}
		System.out.println("Attempt took by you is "+attempt);
		
	}
		
	}