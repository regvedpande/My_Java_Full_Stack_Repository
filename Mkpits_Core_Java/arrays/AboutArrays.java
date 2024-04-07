package com.mkpits.array;
import java.util.Arrays;

public class AboutArrays {
    public static void main(String[] args) {

        int list[] = new int[3];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
                //or you can use toString
                
        System.out.println(Arrays.toString(list));
    }
}
