package com.mkpits.loops;

public class InfiniteLoopForExample {
    public static void main(String[] args) {
        // This loop runs infinitely because there's no update expression
        for (;;) {
            System.out.println("This message will also print forever...");
        }
    }
}
