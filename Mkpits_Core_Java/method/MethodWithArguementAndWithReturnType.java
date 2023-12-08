package com.mkpits.method;

public class MethodWithArguementAndWithReturnType {

	// Method with arguments and return type
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        // Calling the method with arguments
        int result = add(5, 7);

        // Printing the result
        System.out.println("Sum: " + result);
}
}