package com.mkpits.staticandnonstatic;

public class NonStatic_Variable {

	String name2 = "vaibhav"; // non-static variable

	String name1 = "rigved pandey";// non-static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------------------------------");
		System.out.println("types of calling of non-static variable in main method");
		System.out.println("direct calling of non-static variable in static method is not possible, calling through object reference is only possible");
		NonStatic_Variable nSV = new NonStatic_Variable();
		System.out.println("calling of variable- 'name1' using object refernce");
		System.out.println(nSV.name1);
		nSV.getNonStaticName();
		
	}
	
	private void getNonStaticName() {
		Static_Variable sVV = new Static_Variable();
		System.out.println(sVV.name);
	}
	
	// Creating class to call non-static variable in non-static method directly.
	public void callingNsInNs() {
		// calling non-static variable directly in non-static method
		System.out.println("calling non-static variable directly in non-static method");
		System.out.println(name1);
		System.out.println(name2);
	}

}
