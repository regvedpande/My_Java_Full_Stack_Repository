package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListAddAll {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        ArrayList<String> carcompanies = new ArrayList<String>();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many car names you want to add : ");
        int carnames = Integer.parseInt(br.readLine());
        System.out.println("Enter Car Names : ");

        for (int i = 0; i < carnames; i++) {
            carcompanies.add(br.readLine());
        }

       ArrayList<String> anothercarcompanies = new ArrayList<String>();
       System.out.println("How many Car Companies list you want to add this time : ");
       int carnames2 = Integer.parseInt(br.readLine());
       System.out.println("Enter Another Car Names : ");

       for (int i = 0; i < carnames2; i++) {

        anothercarcompanies.add(br.readLine());

       }
       
       System.out.println(anothercarcompanies.addAll(carcompanies));
       System.out.println(anothercarcompanies);


    }
}
