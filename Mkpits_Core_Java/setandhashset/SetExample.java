package com.mkpits.setandhashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<Integer> luckynumbers1 = new HashSet<Integer>();

		luckynumbers1.addAll(Arrays.asList(new Integer[] { 21, 22, 23, 24, 25, 26 }));

		Set<Integer> luckynumbers2 = new HashSet<Integer>();

		luckynumbers2.addAll(Arrays.asList(new Integer[] { 22, 27, 23, 28, 24, 26 }));

		// For Union
		Set<Integer> union = new HashSet<Integer>(luckynumbers1);
		union.addAll(luckynumbers2);
		System.out.println(union);

		// For Intersection
		Set<Integer> intersection = new HashSet<Integer>(luckynumbers1);
		intersection.retainAll(luckynumbers2);
		System.out.println(intersection);

		Set<Integer> difference = new HashSet<Integer>(luckynumbers1);
		difference.removeAll(luckynumbers2);
		System.out.println(difference);

	}
}
