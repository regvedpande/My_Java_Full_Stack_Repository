package com.mkpits.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DequeSmartphone {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Deque<String> smartphones = new ArrayDeque<String>();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How Many smartphones you want to buy : ");
        int list = Integer.parseInt(br.readLine());

        for (int i = 0; i < list; i++) {
            System.out.println("Smartphone Choice " +(i+1));
            smartphones.add(br.readLine());
        }

        System.out.println("Your Smartphones are : " + smartphones);

        System.out.println("Enter First Element : " );
        String check = br.readLine();
        smartphones.add(check);

        System.out.println("Check First Element : ");
        String check2 = br.readLine();

        while (true) {
            if (check.equals(check2)) {
                System.out.println("Your First Smartphone is matching the list which is : " +smartphones.getFirst());
    
            } else {
                System.out.println("Sorting the List of Phones as you have entered it wrong : ");

            Set<String> sortedSet = new LinkedHashSet<>(smartphones);
            List<String> sortedList = new ArrayList<>(sortedSet);
            Collections.sort(sortedList);


                System.out.println("Your Updated List is :" +sortedList);
                System.out.println("Now Enter the Smartphone name to check as your first smartphone got removed : ");
                String another = br.readLine();
                System.out.println("Is Smartphone present in the list : " +sortedList.contains(another));
                System.out.println("Your First Smartphone is : " +sortedList.get(0));
                
            }
           
    
            System.out.println("Your List is :" +smartphones);    
            break;
        }
    
    }
}
