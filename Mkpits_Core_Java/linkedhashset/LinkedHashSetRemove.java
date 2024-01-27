package com.mkpits.linkedhashset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class LinkedHashSetRemove {
    public static void main(String[] args) throws NumberFormatException, IOException {
        LinkedHashSet<String> watches = new LinkedHashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Watches you want to buy : ");
        int buy = Integer.parseInt(br.readLine());

        for (int i = 0; i < buy; i++) {
            System.out.println("Watch Number One : " +i );
            watches.add(br.readLine());
        }

        System.out.println("List of Watches are : " + watches);

        System.out.println("Did you wish to remove any watches : ");
        String remove = br.readLine();
        System.out.println("Watch going to be remove is : " +watches.remove(remove));

        System.out.println("After Removal Watches are : " + watches);

    }
}
