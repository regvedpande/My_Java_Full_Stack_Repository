package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArryListAddSetGetIterateSort {

    public static void main(String[] args) throws IOException {

        ArrayList<String> youtubers = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many YouTubers you want to give Invitation to YouTube Fanfest: ");
        int quantity = Integer.parseInt(br.readLine());

        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter YouTuber : " );
            youtubers.add(br.readLine());
        }

        System.out.println("Names of Invited YouTubers are: " + youtubers);
        System.out.println("Total Number of Invited YouTubers are: " + youtubers.size());

        System.out.println("What YouTuber you want to cancel Invitation to: ");
        String invitation = br.readLine();
        youtubers.remove(invitation);

        System.out.println("List of Invited YouTubers after cancellation are:");
        youtubers.forEach(System.out::println);

        System.out.println("Do you wish to Invite YouTuber in exchange of that: ");
        String invite = br.readLine();
        youtubers.add(invite);

        Collections.sort(youtubers); 

        System.out.println("Final list of Invited YouTubers (sorted): ");
        youtubers.forEach(System.out::println);
    }
}
