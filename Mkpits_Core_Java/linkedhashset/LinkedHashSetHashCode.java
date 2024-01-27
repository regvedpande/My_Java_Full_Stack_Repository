package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class LinkedHashSetHashCode {
    public static void main(String[] args) throws IOException {
        LinkedHashSet<String> music = new LinkedHashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Music Tracks you want to add : ");
        int tracks = Integer.parseInt(br.readLine());

        for (int i = 0; i < tracks; i++) {
            System.out.println("Music Track : " +i );
            music.add(br.readLine());
        }

        System.out.println("Hash Code of the Music Set : " +music.hashCode());
    }
}
