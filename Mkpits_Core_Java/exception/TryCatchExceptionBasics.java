package com.mkpits.exception;

public class TryCatchExceptionBasics {

	public static void main(String[] args) {

		try {

			String names[] = { "Pranav", "Ashik", "Raj" };
			System.out.println(names[3]);

		} catch (ArithmeticException e) {

			// printStackTrace is a Method
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();

		} finally {
			System.out.println("This Case Closed");
		}

		// run in this case also
//		int a = 10;
//		int b = 0;
		try {

			// run in this case also
			int a = 10;
			int b = 0;
			int div = a / b;
			System.out.println(div);

		}

		// shows error for this like red line
		/*
		 * catch (IOException e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * }
		 */

		catch (ArithmeticException e) {

			e.printStackTrace();

		} finally {
			System.out.println("This Case is Also Closed");
		}
	}
}
