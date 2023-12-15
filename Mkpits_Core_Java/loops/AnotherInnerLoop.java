package com.mkpits.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherInnerLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int n = Integer.parseInt(br.readLine());
	    for(int i=0;i<=n;i++) {
	    	for(int j=0;j<=n;j++) {
	    		System.out.println("In");
	    	}
	    	System.out.println("Out");
	    }
	}
}