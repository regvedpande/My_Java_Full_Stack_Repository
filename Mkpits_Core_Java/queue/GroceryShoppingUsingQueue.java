package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class GroceryShoppingUsingQueue {
    public static void main(String[] args) throws NumberFormatException, IOException {

        Queue<String>grocerylist = new PriorityQueue<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many Grocery Items you want to Buy : ");
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Grocery Item Number : " + (i+1));
            grocerylist.add(br.readLine());
        }

        System.out.println("Your Grocery List are : " +grocerylist);

        System.out.println("Do you wish to remove any Item from the Grocery List if you do not need it : ");
        String remove = br.readLine();
        grocerylist.remove(remove);

        System.out.println("Your Updated List are : " + grocerylist);
        System.out.println("Do you wish to remove head list for grocery : ");
        String wipe = "yes";
        String wipe1 = br.readLine();

        if (wipe.equals(wipe1)) {

            System.out.println("Removing Head Element : " + grocerylist.poll());
    

        } else {
            
            System.out.println("Error");
        }

        System.out.println("Your Updated List after prference is : " +grocerylist);

    }
}