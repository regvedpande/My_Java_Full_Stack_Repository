package com.mkpits.arraylist;

import java.util.ArrayList;

public class StatesList {
	public static void main(String[] args) {

//		ArrayList<String> listofstates = new ArrayList<String>(
//				Arrays.asList("Maharashtra", "Gujarat", "Karnataka", "Telangana", "Tamil Nadu", "Kerala"));

		ArrayList<String> listofstates = new ArrayList<String>();
		listofstates.add("Maharashtra");
		listofstates.add("Gujarat");
		listofstates.add("Karnataka");
		listofstates.add("Telangana");
		listofstates.add("Tamil Nadu");
		listofstates.add("Kerala");

//		ArrayList<String> anotherlistofstates = new ArrayList<String>(
//				Arrays.asList("Uttarakhand", "Maharashtra", "Punjab", "Jammu and Kashmir", "Karnataka", "Telangana"));

		ArrayList<String> anotherlistofstates = new ArrayList<String>();
		anotherlistofstates.add("Uttarakhand");
		anotherlistofstates.add("Maharashtra");
		anotherlistofstates.add("Punjab");
		anotherlistofstates.add("Jammu and Kashmir");
		anotherlistofstates.add("Karnataka");
		anotherlistofstates.add("Telangana");

//		Collections.sort(listofstates);
//		System.out.println(listofstates);
//
//		Collections.sort(anotherlistofstates);
//		System.out.println(anotherlistofstates);

		ArrayList<String> check = new ArrayList<String>();

		for (String temp : listofstates) {

			check.add(anotherlistofstates.contains(temp) ? "Yes" : "No");

		}
		System.out.println(check);

	}
}
