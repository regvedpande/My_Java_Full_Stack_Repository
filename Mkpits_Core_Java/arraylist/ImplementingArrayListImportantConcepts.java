package com.mkpits.arraylist;

import java.util.ArrayList;

public class ImplementingArrayListImportantConcepts {

	public static void main(String[] args) {

		ArrayList<Employee> get = new ArrayList<Employee>();
		get.add(new Employee("Rakesh", "30"));
		get.add(new Employee("Marques", "28"));
		get.add(new Employee("John", "24"));
		get.add(new Employee("Narendra", "26"));

//		// you can also do it manually like add data from model class
//		Employee employee = new Employee();
//		employee.setName("Regved");
//		employee.setAge("23");

		ArrayList<Employee> getanother = new ArrayList<Employee>();
		getanother.add(new Employee("Rahul", "32"));
		getanother.add(new Employee("Robert", "29"));
		getanother.add(new Employee("Natasha", "27"));
		getanother.add(new Employee("Chris", "21"));

		get.addAll(getanother);
		for (Employee employee : get) {
			System.out.println(employee);
		}

		System.out.println(get);
		System.out.println(getanother);

	}

}
