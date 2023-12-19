package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayPractice3 {

    public static void main(String[] args) throws IOException {

      
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        //For the Rows
        System.out.println("Enter number of rows: ");
        String rowsRead = reader.readLine();
        int rows = Integer.parseInt(rowsRead);

        //For the Columns
        System.out.println("Enter number of columns: ");
        String columnsRead = reader.readLine();
        int columns = Integer.parseInt(columnsRead);


        int[][] rowsandcolumns = new int[rows][columns];

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Enter value for row , column: ", i + 1, j + 1);
                String valueRead = reader.readLine();
                rowsandcolumns[i][j] = Integer.parseInt(valueRead);
            }
        }
    }
}
