package com.mkpits.string;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String name = "Regved Pande";

        int one = name.indexOf("e");
        System.out.println(one);

        int two = name.indexOf("P", 2);
        System.out.println(two);

        char find = name.charAt(2);
        System.out.println(find);

        String sub = name.substring(2, 8);
        System.out.println(sub);


    }
}