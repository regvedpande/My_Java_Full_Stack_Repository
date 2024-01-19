package com.mkpits.collectionframeworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RestaurantManagementusingList {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        //Name the Customers
        
        List<String>customername = new ArrayList<String>();

        System.out.println("Welcome! to our Restaurant do you want to make any reservation : ");
    
        char ch = (char) br.read();
		br.readLine();
        
        if ( ch == 'Y' || ch == 'y') {
            
            System.out.println("Welcome to our Restaurant");

        } else {
            
            System.out.println("Sorry we cannot help you");
        }

        System.out.println("Can you please tell me your names : ");

        for (int i = 0; i < 6; i++) {
            
            customername.add(br.readLine());

        }

        System.out.println("So your names are : " +customername);



        //Name of Menus

        List<String>restaurantmenu = new ArrayList<String>();

        System.out.println("What would you like to Eat : ");
        

        for (int i = 0; i < 6; i++) {
            
            restaurantmenu.add(br.readLine());
        }

        System.out.println("Your selected menu items are : " +restaurantmenu);


        for (String string : restaurantmenu) {
            
            System.out.println("Sir! Your names and their orders are : " + customername + " " + restaurantmenu.get(customername.indexOf(string)));
        }

    }
}
