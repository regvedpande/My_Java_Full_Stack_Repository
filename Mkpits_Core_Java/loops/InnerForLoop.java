package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InnerForLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int m = Integer.parseInt(br.readLine());
		for (int i = 1;i<=m;i++){
	
			for (int j = 1; j <= (m-i); j++) {
				System.out.print("*\t");
			}
			System.out.println("");
		}

	}
}