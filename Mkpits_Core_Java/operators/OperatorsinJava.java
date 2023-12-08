package com.mkpits.operators;

public class OperatorsinJava {

    // This is the main method that is executed when the program runs
    public static void main(String[] args) {
        // Create an instance of the OperatorsinJava class
        OperatorsinJava o = new OperatorsinJava();

        // Call the getArithmeticOperators method with the value 15
        o.getArithmeticOperators(15);

        // Call the getAssignmentOperators method with the value 72
        o.getAssignmentOperators(72);

        // Call the getLogicalOperators method with the values 4 and 9
        o.getLogicalOperators(4, 9);
    }

    // This method demonstrates the usage of arithmetic operators
    private void getArithmeticOperators(int a) {
        // Print the value of the integer variable
        System.out.println("Integer is: " + a);
    }

    // This method demonstrates the usage of assignment operators
    private void getAssignmentOperators(int x) {
        // Add 10 to the value of x and print the result
        System.out.println(x += 10);
    }

    // This method demonstrates the usage of logical operators
    private void getLogicalOperators(int a, int c) {
        // Compare the values of a and c using the logical OR operator
        boolean compare = a > 10 || c < 10;

        // Print the result of the comparison
        System.out.println(compare);
    }
}
