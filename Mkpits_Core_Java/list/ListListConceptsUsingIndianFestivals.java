package com.mkpits.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ListListConceptsUsingIndianFestivals {

    public static void main(String[] args) throws IOException {
        List<String> festivals = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Taking input for a fixed number of festivals (e.g., 5)
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Indian festival #" + i);
            festivals.add(reader.readLine());
        }

      
        festivals.add(2, "Diwali");

       
        festivals.remove("Holi");

        for (String festivalName : festivals) {
            System.out.println(festivalName);
        }
    }
}





