package com.mkpits.controlflowstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TableUsingForLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
	    int number = Integer.parseInt(br.readLine());
	    for(i =1;i<=10;i++) {
	    	int table = i*number;
	    	System.out.println(number+"*"+i+"=*"+table);
	    	
	    }
	  
	}

}
