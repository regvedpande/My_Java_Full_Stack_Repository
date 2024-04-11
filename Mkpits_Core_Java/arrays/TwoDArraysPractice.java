package com.mkpits.array;

public class TwoDArraysPractice {
    public static void main(String[] args) {
        
        int a[][] = new int[4][5];
        
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

    }
}
