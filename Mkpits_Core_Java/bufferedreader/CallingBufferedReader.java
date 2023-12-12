package com.mkpits.bufferedreader;

public class CallingBufferedReader {

	public static void main(String[] args) throws Exception {
		
        Registration registration = new Registration();
		registration.register();
		
		System.out.println("First Name is: "+registration.firstName);
		System.out.println("Last Name is: "+registration.lastName);
		System.out.println("Email Id is: "+registration.email);
		System.out.println("Age is: "+registration.age);
	}

}