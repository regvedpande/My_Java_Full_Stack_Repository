package com.mkpits.collectionframeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicMathematicalOperationsUsingLambdaExpressions {

	public static void main(String[] args) throws NumberFormatException, IOException {

		interface Addition {

			int addition(int a, int b);

		}

		interface Subtraction {

			int subtraction(int c, int d);
		}

		interface Multiplier {
			int multiply(int e, int f);

		}

		interface Division {

			int division(int g, int h);
		}

		// If you put different variable above and different variable below it doesn't
		// affect the Lambda Expression
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Numbers : ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

//	    Lambda expression implementation
//		Parameters (optional): A comma-separated list of input parameters enclosed in parentheses.
//		Arrow operator (->): Separates the parameters from the expression body.
//		Expression body: Contains the code to be executed, which can be a single statement or a code block within curly braces.

		Addition addition = (a1, b1) -> (a1 + b1);
		int result = addition.addition(a, b);
		System.out.println("Addition : " + result);

		Subtraction subtract = (c, d) -> c - d;
		int result2 = subtract.subtraction(a, b);
		System.out.println("Substraction : " + result2);

		Multiplier multiply = (e, f) -> e * f;
		int result3 = multiply.multiply(a, b);
		System.out.println("Multiplication : " + result3);

		Division division = (g, h) -> g / h;
		int result4 = division.division(a, b);
		System.out.println("Division : " + result4);

	}

}
