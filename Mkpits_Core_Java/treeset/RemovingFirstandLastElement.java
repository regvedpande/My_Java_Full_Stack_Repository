package com.mkpits.treeset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class RemovingFirstandLastElement {
    public static void main(String[] args) throws NumberFormatException, IOException {
        TreeSet<String> doctors = new TreeSet<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Doctors you want to add :  ");
        int store = Integer.parseInt(br.readLine());

        for (int i = 0; i < store; i++) {
            System.out.println("Doctor Preference " + i);
            doctors.add(br.readLine());
            
    }

    System.out.println("Removing First Doctor : " + doctors.pollFirst());
    System.out.println("Removing Last Doctor :" +doctors.pollLast());

    System.out.println("List of Doctors are : " +doctors);
}
}
