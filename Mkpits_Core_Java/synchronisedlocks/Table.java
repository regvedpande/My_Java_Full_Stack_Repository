package com.mkpits.synchronisedlocks;

public class Table {
    
    synchronized public void printTable(int n){
        synchronized(this){
            for (int i = 0; i <= 10; i++) {
                System.out.println(n*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
