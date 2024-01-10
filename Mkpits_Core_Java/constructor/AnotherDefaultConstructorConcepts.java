package com.mkpits.constructor;

public class AnotherDefaultConstructorConcepts {

	private int age;
	private String name;

	// Constructor
	// Constructor has no return type
	// Default Constructor
	public AnotherDefaultConstructorConcepts() {
		age = 22;
		name = "Regved";
	}

	// Getters and Setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnotherDefaultConstructorConcepts a = new AnotherDefaultConstructorConcepts();
		System.out.println(a.getName() + " : " + a.getAge());

		a.setAge(23);
		a.setName("Regved");

		System.out.println(a.getName() + " : " + a.getAge());

	}

}
