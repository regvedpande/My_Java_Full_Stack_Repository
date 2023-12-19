package com.mkpits.array;

public class StringReverse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Input string to be reversed
        String name = "Regved Pande";

        // Creating a character array to store each character of the input string
        char[] charArray = new char[name.length()];

        // Populating the character array with characters from the input string
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = name.charAt(i);
        }

        // Displaying each character of the character array
        System.out.println("Original String:");
        for (char c : charArray) {
            System.out.print(c);
        }
        
        System.out.println(); // Adding a new line for better separation

        // Reversing and displaying the characters of the character array
        System.out.println("Reversed String:");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
