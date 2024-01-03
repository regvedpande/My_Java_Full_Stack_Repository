package com.mkpits.Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InterfaceSub implements InterfaceConcept {
	String name;
	int age;

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Username: ");
		name = br.readLine();

		System.out.println("Enter Age: ");
		age = Integer.parseInt(br.readLine());
	}

	public void output() {
		System.out.println(name + " " + age);
	}
}