package com.mkpits.collectionframeworks;

import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        
        LinkedList<Integer>watchlist = new LinkedList<Integer>();
        watchlist.add(21);
        watchlist.add(22);
        watchlist.add(23);
        watchlist.add(24);

        System.out.println("Removing First Watch from your list : " +watchlist.removeFirst());
        System.out.println("After Removing First Element" + watchlist);

        System.out.println("Removing First Watch from your list : " +watchlist.removeLast());
        System.out.println("After Removing Last Element" + watchlist);

    }
}
