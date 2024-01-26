package com.mkpits.list;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAddAndRemove {
    public static void main(String[] args) throws NumberFormatException, IOException {

        List<String> shoes = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many shoes you want to add : ");
        int add = Integer.parseInt(br.readLine());

        System.out.println("Enter the names of the shoes : ");

        for (int i = 0; i < add; i++) {
            shoes.add(br.readLine());
        }

        System.out.println(shoes);

        System.out.println("Enter the Shoes that you want to remove from the list : ");
        String remove = br.readLine();
        shoes.remove(remove);

        System.out.println("Enter the Shoes name you want to add in exchange of that : ");
        String value = br.readLine();
        shoes.add(value);

        Collections.sort(shoes);

        shoes.forEach(System.out::println);

    }
}