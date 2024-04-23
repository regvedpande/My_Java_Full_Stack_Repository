package com.mkpits.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputOutput {
    public static void main(String[] args) {
        try {
            File myFile = new File("nonexistent_file.txt"); 
            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

