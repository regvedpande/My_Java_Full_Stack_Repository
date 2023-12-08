package com.mkpits.constructor;

public class ConstructorObject2 {

	String number;
	String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorObject2 object2 = new ConstructorObject2();
		object2.getmyDetails();
		
		ConstructorObject2 object3 = new ConstructorObject2("87484947839", "Bruce Wayne");
		object3.getmyDetails();
		
		ConstructorObject2 object4 = new ConstructorObject2(object3);
		object4.getmyDetails();
		
	}
	
	public void getmyDetails() {
		System.out.println("My Name is :"+name+" and my number is : "+number);
	}
	
	public ConstructorObject2() {
		name = "Tony Stark";
		number = "9462834743";
		System.out.println("These are Constructors with no Arguement");
		}
	
	public ConstructorObject2(String num, String n) {
		 name = n;
		 number = num;
		System.out.println("These are Constructors with Arguement");
	}
	
	public ConstructorObject2(ConstructorObject2 o) {
		name = o.name;
		number = o.number;
		System.out.println("These are Constructors with Object");
	}

}
