package com.mkpits.array;

public class LargestNum {

    public static void main(String[] args) {

        int numbers[] = {1, 4, 30, 2, 5};

        // Set the initial value of 'largest' to the first element of the array
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}
