package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashMapPracticeNumber4 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        HashMap<String, String> groceryList = new HashMap<String, String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many people want to do shopping : ");
        int shop = Integer.parseInt(br.readLine());

        for (int i = 1; i <= shop; i++) {

            System.out.println("Enter shopper Name " + i + ":");
            String name = br.readLine();

            System.out.println("What's on your grocery list? ");
            String item = br.readLine();

            groceryList.put(name, item);
        }

        System.out.println("Here's the grocery list: " + groceryList + "\n");

        for (String shopper : groceryList.keySet()) {
            System.out.println("How much " + groceryList.get(shopper) + " do you need, " + shopper + " 1) 1   2) 2   3) 3 \n");
            int quantity = Integer.parseInt(br.readLine());
            int price;

            switch (quantity) {

                case 1:
                    System.out.println("You want " + quantity + groceryList.get(shopper));
                    price = 50*quantity;
                    System.out.println("Price of "+groceryList.get(shopper) +price+ "rupees\n");
                    break;

                case 2 :
                    System.out.println("You want " + quantity + groceryList.get(shopper));
                    price = 60*quantity;
                    System.out.println(("Price of "+groceryList.get(shopper) + price + "rupees\n"));
                    break;

                case 3 :
                    System.out.println("You want " + quantity + groceryList.get(shopper));
                    price = 100*quantity;
                    System.out.println(("Price of "+groceryList.get(shopper)+ price + "rupees\n"));
                    break;

                default:
                    System.out.println("Sorry, that item is not currently available.");
                    break;
            }
        }
    }
}
