package com.mkpits.file;

import java.io.File;

public class FileIo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C:\\Program Files\\Git");
		String[] extractlists = f.list();

		for (int i = 0; i < extractlists.length; i++) {

			// Taking properties of parent File
			File f2 = new File(f, extractlists[i]);

			if (f2.isDirectory()) {
				System.out.println(f.getName() + " is Directory");

			} else if (f2.isFile()) {
				System.out.println(f.getName() + " is File");

			}
		}

	}

}
