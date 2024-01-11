package com.mkpits.array;

public class PassbyReference {

    public static void main(String[] args) {

        String[] about = {"Regved", "21", "Student"};

        change(about);

        printArray(about);

    }

    public static void change(String[] about) {
      
        about[0] = "Regved Pande";
        about[1] = "23";
        about[2] = "Programmer";
    }

    public static void printArray(String[] about) {
        for (int i = 0; i < about.length; i++) {
            System.out.println(about[i]);
        }
    }
}

