package com.mkpits.datatype;

public class DataTypeExplanation {

    public static void main(String[] args) {

        // Numeric data types
        // byte (8 bits) - for small whole numbers
        byte ageInMonths = 12;
        System.out.println("Age in months (byte): " + ageInMonths);

        // short (16 bits) - for whole numbers with a larger range than byte
        short employeeId = 1024;
        System.out.println("Employee ID (short): " + employeeId);

        // int (32 bits) - most commonly used for whole numbers
        int population = 1234567;
        System.out.println("Population (int): " + population);

        // long (64 bits) - for very large whole numbers
        long worldPopulation = 8000000000L;  // Use L suffix for long literals
        System.out.println("World Population (long): " + worldPopulation);

        // Floating-point data types
        // float (32 bits) - for single-precision decimal numbers
        float pi = 3.14159f;  // Use f suffix for float literals
        System.out.println("Pi (float): " + pi);

        // double (64 bits) - for double-precision decimal numbers (more precise than float)
        double gravity = 9.81;
        System.out.println("Gravity (double): " + gravity);

        // Character data type
        // char (16 bits) - for storing a single character
        char initial = 'J';
        System.out.println("Initial (char): " + initial);

        // Boolean data type
        // boolean (1 bit) - for logical values (true or false)
        boolean isStudent = true;
        System.out.println("Is Student (boolean): " + isStudent);
    }
}
