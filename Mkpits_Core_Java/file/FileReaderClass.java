package com.mkpits.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("D:\\AnotherFile.txt");
		BufferedReader br = new BufferedReader(fr);
		String read = "";
		// we are assigning words one by one in read which must be a String Type
		while ((read = br.readLine()) != null) {
			System.out.print(read);

		}

	}

}
