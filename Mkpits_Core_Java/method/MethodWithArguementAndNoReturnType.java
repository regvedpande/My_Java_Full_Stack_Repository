package com.mkpits.method;

public class MethodWithArguementAndNoReturnType {

	
public static void main(String[] args) {
	

	MethodWithArguementAndNoReturnType n = new MethodWithArguementAndNoReturnType();
	n.getUser("Regved");
	n.getPassword("Regved123");
	n.getNumber("9049874883");
	n.getBoolean("True");
}

public void getUser(String user) {
	System.out.println("User Name is :-" +user);
}

public void getPassword(String password) {
	System.out.println("Password :- " + password);
}	

public void getNumber(String number) {
	System.out.println("Number is :-" + number);
}

public void getBoolean(String bool) {
	System.out.println("User Name is :-" + bool);
}
}