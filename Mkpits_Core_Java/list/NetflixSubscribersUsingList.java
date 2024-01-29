package com.mkpits.list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NetflixSubscribersUsingList {
    public static void main(String[] args) throws NumberFormatException, IOException {

        List<String> netflixssubscribers = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many subscribers you want to Add : ");
        int list = Integer.parseInt(br.readLine());

        for (int i = 0; i < list; i++) {
            System.out.println("Enter Name of Subscriber Number : " +i);
            netflixssubscribers.add(br.readLine());
        }

        System.out.println("Your List of Subscribers are : " + netflixssubscribers);

        System.out.println("Do you wish to add to which particular index : ");
        int index =  Integer.parseInt(br.readLine());
        netflixssubscribers.get(index);

        System.out.println("Do you wish to set any subcriber in place of that : ");
        String add = br.readLine();
        netflixssubscribers.set(index, add);

        System.out.println("Your Updated List of Subscribers are : " + netflixssubscribers);

    }
}
