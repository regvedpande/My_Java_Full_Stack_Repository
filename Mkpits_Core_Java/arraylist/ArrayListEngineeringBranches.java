package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ArrayListEngineeringBranches {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        LinkedList<String> engineeringdisciplines = new LinkedList<String>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This is the list of the Engoneering Majors you want to add : ");
        System.out.println("How many Engineering Disciplines you want to add : " );
        int count  = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
        
        System.out.println("Enter Engineering type Number "  + (i+1));
        engineeringdisciplines.add(br.readLine());

        }

       System.out.println("Your List of Engineering disciples  are : " + engineeringdisciplines);

       System.out.println("Insert the First Element that you want to add : ");
       String addfirst = br.readLine();
       engineeringdisciplines.addFirst(addfirst);

       System.out.println("Insert the Last Element that you want to add : ");
       String addlast = br.readLine();
       engineeringdisciplines.addLast(addlast);

       System.out.println("After adding First and Last Element we may have Uodated List as :" +engineeringdisciplines);

       System.out.println("Insert the First Element that you want to offer: ");
       String offerFirst = br.readLine();
       engineeringdisciplines.offerFirst(offerFirst);

       System.out.println("Insert the Last Element that you want to offer: ");
       String offerLast = br.readLine();
       engineeringdisciplines.offerLast(offerLast);  

       System.out.println("Final Updated List: " + engineeringdisciplines);

       System.out.println("After adding First and Last Element we may have Uodated List as :" +engineeringdisciplines);

    }
}
