package com.mkpits.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPractice2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String Name : ");
        String capture = br.readLine();

        System.out.println("Do you want to Split : " );
        String store = br.readLine();

        if (store.equalsIgnoreCase("yes")) {
            String[] parts = capture.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        }

        System.out.println("Do you wish to join : " );
        String anotherstore = br.readLine();

        if (anotherstore.equalsIgnoreCase("yes")) {
            String[] words = capture.split(" ");
            String joinedString = String.join(" ", words);
            System.out.println(joinedString);
        }
    }
}
