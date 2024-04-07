package com.mkpits.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String Name : ");
        String store = br.readLine();

        System.out.println("Enter the Position that you want to check string at : ");
        int check = Integer.parseInt(br.readLine());

        if (check >= 0 && check < store.length()) {
            char character = store.charAt(check);
            System.out.println("Character at position " + check + " is " + character);
        } else {
            System.out.println("Invalid position");
        }
    }
}
