package com.mkpits.constructor;

public class ConstructorObject {

	int pinCode, id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorObject object = new ConstructorObject();
		object.getMember();
		
		ConstructorObject object2 = new ConstructorObject(440034, 2301);
		object2.getMember();
		
		ConstructorObject object3 = new ConstructorObject(object2);
		object3.getMember();
		
	}
	
	public void getMember() {
		System.out.println("Id is :- "+id + " Pincode is :- "+pinCode);
	}
	
	public ConstructorObject() {
       //Constructor Object called the values from object so it gets assigned first constructor that we have declared at the top 
		pinCode = 445001;
		id = 1034;
		System.out.println("Constructor with no Arguement");
	}
	public ConstructorObject(int p, int i) {
		//now the value gets changed with the given below and gets assigned to 2nd
		pinCode = p;
		id = i;
		System.out.println("Parameterised Constructor");
	}

	//in these we have created object constructor  
	public ConstructorObject(ConstructorObject o) {
		// TODO Auto-generated constructor and it pulled the value of 2nd
		System.out.println("Contructor with Object");
		pinCode = o.pinCode;
		id = o.id;
	}

}