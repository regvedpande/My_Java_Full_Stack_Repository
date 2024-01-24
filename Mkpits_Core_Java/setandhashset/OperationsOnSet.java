package com.mkpits.setandhashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OperationsOnSet {

	public static void main(String[] args) {

		Set<Integer> luckynumbers1 = new HashSet<Integer>();

		luckynumbers1.addAll(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6 }));

		Set<Integer> luckynumbers2 = new HashSet<Integer>();

		luckynumbers2.addAll(Arrays.asList(new Integer[] { 2, 7, 3, 8, 4, 9 }));

		luckynumbers1.addAll(luckynumbers2);
		System.out.println(luckynumbers1);

		Iterator allvalues = luckynumbers1.iterator();
		while (allvalues.hasNext()) {
			System.out.println(allvalues.next());

		}

		System.out.println(luckynumbers1.hashCode());

	}

}
