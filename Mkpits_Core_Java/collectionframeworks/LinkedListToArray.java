package com.mkpits.collectionframeworks;

import java.util.LinkedList;

public class LinkedListToArray {
    
    public static void main(String[] args) {
        
        LinkedList<String>convert = new LinkedList<>();
        convert.add("Control");
        convert.add("Red Dead Redemption 2");
        convert.add("Grand Theft Auto VI");
        convert.add("Far Cry 6");

        Object[] o = convert.toArray();
        System.out.println(o);

        for (Object object : o) {
            System.out.println(object);
        }

    }
}
