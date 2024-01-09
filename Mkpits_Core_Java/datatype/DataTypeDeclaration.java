package com.mkpits.datatype;

public class DataTypeDeclaration {
	// Primitive data types
	boolean booleanValue;
	char charValue;
	byte byteValue;
	short shortValue;
	int intValue;
	long longValue;
	float floatValue;
	double doubleValue;

	// User Defined Data Type
	String name;
	// Corrected the data type to boolean[] for boolean values
	public boolean[] booleanValues;

	// Corrected the constructor parameters to match data types
	public DataTypeDeclaration(boolean booleanValue, char charValue, byte byteValue, short shortValue, int intValue,
			long longValue, float floatValue, double doubleValue) {
		super();
		this.booleanValue = booleanValue;
		this.charValue = charValue;
		this.byteValue = byteValue;
		this.shortValue = shortValue;
		this.intValue = intValue;
		this.longValue = longValue;
		this.floatValue = floatValue;
		this.doubleValue = doubleValue;
	}
}
