package com.mkpits.file;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOutputStreamReader {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Text : ");
		String store = br.readLine();
		store = store + " \n";

		byte[] b = store.getBytes();
		System.out.println(b); // [B@1055e4af this is the byte value of regved

		// File output Stream converts the byte data to String
		FileOutputStream fo = new FileOutputStream("D:\\ MySavedFile.txt ", true);

		fo.write(b);
		fo.close();

		System.out.println("Your Data is Written");

	}

}
