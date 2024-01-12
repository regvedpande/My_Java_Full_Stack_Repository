package com.mkpits.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamReader {

	public static void main(String[] args) throws IOException {

		FileInputStream fr = new FileInputStream("D:\\ MySavedFile.txt ");
		int a = 0;
		while ((a = fr.read()) != -1) {

			System.out.println((char) a);
		}
		fr.close();

	}

}
