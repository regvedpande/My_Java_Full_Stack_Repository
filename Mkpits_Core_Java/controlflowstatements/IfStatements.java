package com.mkpits.controlflowstatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfStatements {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter User Name");
		String userName = br.readLine();
		
		System.out.println("Enter User Password");
		String userPassword = br.readLine();
		
		System.out.println("Enter user age");
		String userAge = br.readLine();
		
		System.out.println("Enter User Id");
		String userId = br.readLine();
		
		
		if(userName.equals("Regved")) {
		    System.out.println("Login Successful");
		}
		
		if(userName.equals("")) {
		    System.out.println("Login Unsuccessful");
		}
		
		if(userPassword.equals("Regved123")) {
		    System.out.println("Login Successful");
		}
		
		if(userPassword.equals("")) {
		    System.out.println("Login Unsuccessfull");
		}
		
		if(userAge.equals("22")) {
		    System.out.println("Login Successful");
		}
		
		if(userAge.equals("")) {
		    System.out.println("Login Unsuccessful");
		}
		
		if(userId.equals("234")) {
		    System.out.println("Login Successfl");
		}
		
		if(userName.equals("")) {
		    System.out.println("Login Unsuccessful");
		}
	}

}
