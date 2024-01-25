package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapPractice {
    public static void main(String[] args) throws NumberFormatException, IOException {

        HashMap<String, String> cities = new HashMap<String, String>();
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Maximum Cities you want to add : ");
        int max = Integer.parseInt(br.readLine());

        for (int i = 0; i < max; i++) {

            cities.put(br.readLine(), br.readLine());

        }

        List<String>cityid = new ArrayList<String>(cities.keySet());
        
        Collections.sort(cityid);

        for (String key : cityid) {
            
            System.out.println(key + " : " + cities.get(key));
        }
  
    }
}
