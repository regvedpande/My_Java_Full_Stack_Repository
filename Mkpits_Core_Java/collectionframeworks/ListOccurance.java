package com.mkpits.collectionframeworks;

import java.util.ArrayList;
import java.util.List;

public class ListOccurance {

	public static void main(String[] args) {

		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(22);
		numbers1.add(23);
		numbers1.add(24);
		numbers1.add(25);
		numbers1.add(26);

		List<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(32);
		numbers2.add(33);
		numbers2.add(34);
		numbers2.add(35);
		numbers2.add(36);

		numbers1.addAll(numbers2);
		System.out.println(numbers1);

		int index = numbers1.indexOf(23);
		System.out.println(index);

		int index2 = numbers2.lastIndexOf(35);
		System.out.println(index2);

	}
}
