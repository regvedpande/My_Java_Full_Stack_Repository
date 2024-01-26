package com.mkpits.list;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListAddAndUpdate {
    public static void main(String[] args) throws NumberFormatException, IOException {

        List<String> smartphones = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many smartphone name you want to add : ");
        int add = Integer.parseInt(br.readLine());

        System.out.println("Enter the names of the smartphones : ");

        for (int i = 0; i < add; i++) {
            smartphones.add(br.readLine());
        }

        System.out.println(smartphones);

        System.out.println("Enter the speaker name you want to add");
        String value = br.readLine();
        smartphones.add(value);

        System.out.println("Enter at which index you want to add");
        int index = Integer.parseInt(br.readLine());

       
        smartphones.add(index, value);

        System.out.println(smartphones);
    }
}