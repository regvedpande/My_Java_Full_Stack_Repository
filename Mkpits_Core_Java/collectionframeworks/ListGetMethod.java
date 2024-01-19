package com.mkpits.collectionframeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListGetMethod {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> footballplayers = new ArrayList<String>();

		System.out.println("Enter the Players Name: ");

		for (int i = 0; i < 5; i++) {
			footballplayers.add(br.readLine());
		}

		System.out.println(footballplayers);

		Collections.sort(footballplayers);
		Collections.sort(footballplayers, Collections.reverseOrder());

		String getplayernumberone = footballplayers.get(0);
		String getplayernumbertwo = footballplayers.get(1);
		String getplayernumberthree = footballplayers.get(2);
		String getplayernumberfour = footballplayers.get(3);
		String getplayernumberfive = footballplayers.get(4);

		System.out.println("Player one is : " + getplayernumberfive);
		System.out.println("Player two is : " + getplayernumbertwo);
		System.out.println("Player three is : " + getplayernumberthree);
		System.out.println("Player four is : " + getplayernumberfour);
		System.out.println("Player five is : " + getplayernumberfive);

	}

}
