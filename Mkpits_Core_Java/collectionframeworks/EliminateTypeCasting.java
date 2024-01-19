package com.mkpits.collectionframeworks;

import java.util.ArrayList;

public class EliminateTypeCasting {

	public static void main(String[] args) {

		// Here we are printing Array of size 10 with 10 as its zeroth index value so 9
		// left remaining so those 9 will consume memory space unecessarily

		Integer[] array = new Integer[10];
		array[0] = 10;
		int assign = array[0];
		// System.out.println(assign);
		// or
		System.out.println(array.length);

		// Non Generic Version
		ArrayList array2 = new ArrayList();
		array2.add(28);
		array2.add("Rabbit");
		array2.add('P');
		array2.add(9049874883L);
		array2.add(90.42);

		int i = (Integer) array2.get(4);
		System.out.println(i);

		System.out.println(array2.get(0));
		System.out.println(array2.get(1));
		System.out.println(array2.get(2));
		System.out.println(array2.get(3));

		// Generic Version
		ArrayList<Integer> array3 = new ArrayList<Integer>();
		array3.add(23);

		System.out.println(i);

	}

}
