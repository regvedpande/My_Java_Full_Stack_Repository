package com.mkpits.file;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Text : ");
		String collect = br.readLine();

		FileWriter fw = new FileWriter("D:\\AnotherFile.txt", true);
		fw.write(collect);
		fw.close();

	}

}
