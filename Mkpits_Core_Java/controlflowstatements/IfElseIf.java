package com.mkpits.controlflowstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseIf {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter User Name");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter User Name");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter User Name");
		int num3 = Integer.parseInt(br.readLine());
		
		
		
        if (num1 > num2 && num1>num3) {
			
			System.out.println("Number First is Greater");
			
		}else if (num2 > num1 && num2 > num3) {
			
			System.out.println("Number Second is Greater");
			
		}else if (num3 > num1 && num3>num2) {
			
			System.out.println("Number Third is Greater");
		
		}
			
		
		
	}

}
