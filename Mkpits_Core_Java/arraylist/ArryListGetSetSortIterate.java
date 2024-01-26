package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArryListGetSetSortIterate {
    public static void main(String[] args) throws NumberFormatException, IOException {
    

        ArrayList<String> ramjanmabhoomi = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many you want to invite : ");
        int list = Integer.parseInt(br.readLine());

        for (int i = 0; i < list; i++) {
            
            System.out.println("Enter Guest Number "+i );
            ramjanmabhoomi.add(br.readLine());
        }

        System.out.println("Your Invited Guests are : " + ramjanmabhoomi);


        System.out.println("Is there anyone in the list you want to cancel invitation to : ");
        String names = br.readLine();
        ramjanmabhoomi.remove(names);

        System.out.println("Is there anyone in the list you want to add invitation to in place of that : ");
        String anothernames = br.readLine();
        ramjanmabhoomi.add(anothernames);

        System.out.println(ramjanmabhoomi);

        ramjanmabhoomi.forEach((n) -> System.out.println("Invited Guests are: " + n));


    }
}
