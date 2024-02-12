package com.mkpits.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(1);

        System.out.println("Original LinkedList: " + linkedList);

        // Convert to array
        Integer[] array = convertToArray(linkedList);
        System.out.println("Array from LinkedList: " + java.util.Arrays.toString(array));
    }

    private static Integer[] convertToArray(LinkedList<Integer> list) {
        return list.toArray(new Integer[0]);
    }
}


