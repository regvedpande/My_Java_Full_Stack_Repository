package com.mkpits.exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryCatchExceptionUsingFinally {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader(
					"D:\\mkpits_workspace\\MKPITS_CORE_JAVA_REGVED_PANDE\\src\\com\\mkpits\\file\\FileInputStreamReader1.java");
			BufferedReader br = new BufferedReader(fr);
			String read = " ";
			// we are assigning words one by one in read which must be a String Type
			while ((read = br.readLine()) != null) {
				System.out.println(read);

			}
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();

		} finally {

			try {
				FileReader fr = new FileReader(
						"D:\\mkpits_workspace\\MKPITS_CORE_JAVA_REGVED_PANDE\\src\\com\\mkpits\\file\\FileInputStreamReader1.java");
				BufferedReader br = new BufferedReader(fr);
				String read = " ";
				// we are assigning words one by one in read which must be a String Type
				while ((read = br.readLine()) != null) {
					System.out.println(read);
					System.out.println("This Case is closed now");
				}
			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}