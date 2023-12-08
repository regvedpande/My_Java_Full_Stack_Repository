package com.mkpits.method;

public class MethodWithReturnTypeUsingNonStatic {

	public  String getUserCredentials(String getUserName, String getUserPassword ) {
		
		return "Username is : " + getUserName + "and Password is" + getUserPassword;
	}
	public static void main(String[] args) {
		String getUserName = "Regved";
		String getUserPassword = "Regved123";
		MethodWithReturnTypeUsingNonStatic nonStatic = new MethodWithReturnTypeUsingNonStatic ();
		String credentials = nonStatic.getUserCredentials(getUserName, getUserPassword);
	    System.out.println(credentials);
	}
}
