package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddGetSetSort {
    public static void main(String[] args) throws NumberFormatException, IOException {
        ArrayList<String> footballplayers = new ArrayList<>();

        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many football players you want to add : ");
        int num = Integer.parseInt(br.readLine());

        System.out.println("Enter the Players Name : ");

        for (int i = 0; i < num; i++) {

           footballplayers.add(br.readLine()); 
        }

        System.out.println("List of football players are : " +footballplayers);

        Collections.sort(footballplayers);
        footballplayers.forEach((n) -> { System.out.println(n); } );

        System.out.println("Which football player index you want get : " );
        String player = br.readLine();


        int find = footballplayers.indexOf(player);
        System.out.println("Index of the Player is : " +find);


        
    }
}
