package com.mkpits.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class IteratingAQueue {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
          Queue<String>icecream = new PriorityQueue<String>();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How many ice cream flavours you want to add in the Queue : " );
            int add = Integer.parseInt(br.readLine());
    
            for (int i = 0; i < add; i++) {
                
               System.out.println("IceCream Number : " +i);
               icecream.add(br.readLine());

            }
    
            System.out.println("Your Icecream names are : " + icecream);
            
            System.out.println("Do you wish to remove any Icecream from the List : ");
            String remove  = br.readLine();
            icecream.remove(remove);

            System.out.println("Your Iterating List is : ");

            Iterator<String>iterate = icecream.iterator();

            while (iterate.hasNext()) {
                System.out.println(iterate.next());

            }


    }
}
