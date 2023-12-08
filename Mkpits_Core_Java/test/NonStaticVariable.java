package com.mkpits.test;

import com.mkpits.test.NonStaticVariable;

public class NonStaticVariable {
    // This variable stores a pincode
    public int PinCode = 440030;
    // This variable stores a floating point number
    public float Number = 20.44f;
    // This variable stores a boolean value (true or false)
    public boolean bool = true;
    // This variable stores a character
    public char ch = 'C';
    // This variable stores a byte of characters
    public byte byNumber = '2';
    //This variable stores a long of characters
    public long myLong = 12345678910L;
    //This variable stores a short of characters
    short myShort = 10;
    
    

    public static void main(String[] args) {
        // Create a new instance of the NonStaticVariable class
        NonStaticVariable variable = new NonStaticVariable();

        // Print the value of the PinCode variable
        System.out.println("PinCode is: " + variable.PinCode);

        // Print the value of the Number variable
        System.out.println("Number is: " + variable.Number);

        // Print the value of the bool variable
        System.out.println("Boolean is: " + variable.bool);

        // Print the value of the ch variable
        System.out.println("Character is: " + variable.ch);

        // Print the value of the byte variable
        System.out.println("Byte is: " + variable.byNumber);
        
        // Print the value of the long variable
        System.out.println("Long is: " + variable.myLong);
        
        // Print the value of the short variable
        System.out.println("myShort is: " + variable.myShort);

    }
}