package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class LinkedHashSetAdd {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        LinkedHashSet<String> keycaps = new LinkedHashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of keycaps you want to pluck from the Keyboard : ");
        int pluck = Integer.parseInt(br.readLine());

        for (int i = 0; i < pluck; i++) {
            System.out.println("Keycaps Number One : " +i );
            keycaps.add(br.readLine());
        }

        System.out.println("LinedkedHashSet of Keycaps are : " +keycaps);
    }
}
