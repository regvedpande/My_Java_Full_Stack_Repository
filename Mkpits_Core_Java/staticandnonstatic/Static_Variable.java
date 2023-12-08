package com.mkpits.staticandnonstatic;

public class Static_Variable {
	
	public static String name = "Regved1";
	// for accessing variable in the same class public declaration is not necessary.
	// but if you want to call variable in other class then declare its scope as public 
	
	
	public static void main(String[] args) {
		//String name = "Regved";
		//System.out.println(name); // local variable called first acc. to preference
		int a =70;
		System.out.println("--------------------------------------------------------------------");
		System.out.println("types of calling of static variable in main method");
		System.out.println("type-1 : direct calling of static variable inside static method");
		System.out.println(name); // 1] direct calling of static variable inside static method .
		System.out.println("type-2 : calling of static variable using class name reference");
		System.out.println(Static_Variable.name);// 2] calling of static variable using class name reference
		Static_Variable sM = new Static_Variable();
		System.out.println("type-3 : calling static variable using object reference");
		System.out.println(sM.name);// 3] calling static variable using object reference.
		System.out.println("--------------------------------------------------------------------");
		
		
	}

}
