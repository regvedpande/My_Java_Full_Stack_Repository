package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class LinkedHashSetLambdaExpressions {
    public static void main(String[] args) throws IOException {
        
        LinkedHashSet<String> movies = new LinkedHashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Movies you want to watch : ");
        int tracks = Integer.parseInt(br.readLine());

        for (int i = 0; i < tracks; i++) {
            System.out.println("Movie Preferences : " +i );
            movies.add(br.readLine());
        }

        System.out.println("Your List of Movies are : " +movies);

        movies.forEach(n -> System.out.println(n));

    }
}
