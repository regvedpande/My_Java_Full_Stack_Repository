package com.mkpits.classesandobjects;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result;
        switch (operator) {
          case '+':
            result = num1 + num2;
            break;
          case '-':
            result = num1 - num2;
            break;
          case '*':
            result = num1 * num2;
            break;
          case '/':
            if (num2 == 0) {
              System.out.println("Error: Division by zero");
              return;
            }
            result = num1 / num2;
            break;
          default:
            System.out.println("Invalid operator");
            return;
        }

        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
    }
  }
}
