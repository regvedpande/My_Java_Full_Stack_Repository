package com.mkpits.thread;

public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("====" + i + " ");
        }
    }
}
