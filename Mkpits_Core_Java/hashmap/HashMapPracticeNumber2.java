package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapPracticeNumber2 {
  public static void main(String[] args) throws NumberFormatException, IOException {

    HashMap<String, String> countryandthereattractions = new HashMap<String, String>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("How many Countries you want to add : ");
  
      int store = Integer.parseInt(br.readLine());
      for (int i = 1; i <= store; i++) {
        System.out.println("Enter Country Name :");
        String countryName = br.readLine();
        System.out.println("Enter Attraction Name :");
        String attractionName = br.readLine();
        countryandthereattractions.put(countryName, attractionName);
      }

      System.out.println("HashMap : " + countryandthereattractions);
    } 
  }


