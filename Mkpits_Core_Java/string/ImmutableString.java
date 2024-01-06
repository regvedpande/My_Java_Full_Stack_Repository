package com.mkpits.string;

/**
 * ImmutableString
 */
public class ImmutableString {

    public static void main(String[] args) {
        String firsthalf = "SR77";
        String secondhalf = "Blackbird";
        String fullname = firsthalf + " " + secondhalf;
        System.out.println(fullname);

        int length = fullname.length();
        System.out.println(length);


        //Immutable String Example

        String company = "Apple";
        String companyproduct = company.concat("iPhone");
        System.out.println("Product made by Company is : " + companyproduct);

    }
}