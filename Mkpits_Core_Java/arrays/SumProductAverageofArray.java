package com.mkpits.array;

/**
 * SumProductAverageofArray
 */
public class SumProductAverageofArray {

    public static void main(String[] args) {
        
        int[] numbers = {1,2,3,-4,8};

        int sum = 0; //to store the sum

        int product = 1; 

        double average;

        for (int i = 0; i < numbers.length; i++) {
            
            sum  = sum + numbers[i];
            product = product * numbers[i];

        }

            average = (double) sum /numbers.length;

            System.out.println("Sum is " +sum);
            System.out.println("Product is " +product);
            System.out.println("Average is " +average);
        }



    }
