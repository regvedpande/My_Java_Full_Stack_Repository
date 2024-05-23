package com.mkpits.thread;

public class MyThread2 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <= 5; i++) {
            System.out.println("Threads are Runnable " + i);
        }
    }
}
