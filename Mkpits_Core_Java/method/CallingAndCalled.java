package com.mkpits.method;

public class CallingAndCalled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallingAndCalled cdc = new CallingAndCalled();
		cdc.getDetails(555);//this is argument and it is calling
	}

	private void getDetails(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);//this is parameter and it is being called
	}
	
}
