package com.mkpits.loops;

public class RectangleUsingForLoop {

    public static void main(String[] args) {
        int rows = 5;
        int cols = 8;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
