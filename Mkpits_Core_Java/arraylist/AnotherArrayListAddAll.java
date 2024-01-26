package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class AnotherArrayListAddAll {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        ArrayList<String> bikecompanies = new ArrayList<String>();
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Bike names you want to add : ");
        int bikenames = Integer.parseInt(br.readLine());
        System.out.println("Enter Bike Names : ");

        for (int i = 0; i < bikenames; i++) {
            bikecompanies.add(br.readLine());
        }

       ArrayList<String> anotherbikecompanies = new ArrayList<String>();
       System.out.println("How many Bike names list you want to add this time : ");
       int carnames2 = Integer.parseInt(br.readLine());
       System.out.println("Enter Another Car Names : ");

       for (int i = 0; i < carnames2; i++) {

        anotherbikecompanies.add(br.readLine());

       }
       
       System.out.println(anotherbikecompanies.addAll(bikecompanies));

       Collections.sort(anotherbikecompanies);

       anotherbikecompanies.forEach((n) -> {System.out.println("Bike Comapanies : " +n);});

    }
}

