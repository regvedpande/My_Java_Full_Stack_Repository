package com.mkpits.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListAdd {
    public static void main(String[] args) throws NumberFormatException, IOException {

        List<String> speakers = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many speakers you want to add : ");
        int add = Integer.parseInt(br.readLine());

        System.out.println("Enter the names of the speakers : ");

        for (int i = 0; i < add; i++) {
            speakers.add(br.readLine());
        }

        System.out.println(speakers);
    }
}
