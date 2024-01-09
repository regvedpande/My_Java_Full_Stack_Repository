package com.mkpits.datatype;

public class DataTypeInitialization {
	public static void main(String[] args) {
		// Create a DataTypeDeclaration object with values for all data types
		DataTypeDeclaration d = new DataTypeDeclaration(true, 'R', (byte) 12, (short) 11, 81, 90498748823L, 12.5f,
				233.40, "Regved Pande", new boolean[] { true, false, true });

		// Print the values of all data types
		System.out.println("booleanValue: " + d.booleanValue);
		System.out.println("charValue: " + d.charValue);
		System.out.println("byteValue: " + d.byteValue);
		System.out.println("shortValue: " + d.shortValue);
		System.out.println("intValue: " + d.intValue);
		System.out.println("longValue: " + d.longValue);
		System.out.println("floatValue: " + d.floatValue);
		System.out.println("doubleValue: " + d.doubleValue);
		System.out.println("name: " + d.name);
		System.out.println("booleanValues: " + d.booleanValues);
	}
}
