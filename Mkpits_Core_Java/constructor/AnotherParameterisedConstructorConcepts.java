package com.mkpits.constructor;

public class AnotherParameterisedConstructorConcepts {

	private int age;
	private String name;

	// Parameterized Constructor
	public AnotherParameterisedConstructorConcepts(int a, String n) {
		this.age = a;
		this.name = n;
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

		AnotherParameterisedConstructorConcepts a = new AnotherParameterisedConstructorConcepts(20, "Ayush");
		System.out.println(a.getName() + " : " + a.getAge());

	}

}
