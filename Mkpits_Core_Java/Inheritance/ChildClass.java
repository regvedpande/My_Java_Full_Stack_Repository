package com.mkpits.inheritance;

public class ChildClass extends ParentClass {

	long mobile;
	String gender;
	int pincode;

	public void getMobile(long mobile) {

		this.mobile = mobile;

	}

	public void getGender(String gender) {

		this.gender = gender;

	}

	public void getPinCode(int pincode) {

		this.pincode = pincode;

	}

	public void getAllDetails() {
		System.out.println("Your First Name :" + firstname);
		System.out.println("Your Last Name:" + lastname);
		System.out.println("Your Email Name:" + email);
		System.out.println("Your Mobile Number:" + mobile);
		System.out.println("Your Gender is :" + gender);
		System.out.println("Your PinCode is " + pincode);

	}
}
