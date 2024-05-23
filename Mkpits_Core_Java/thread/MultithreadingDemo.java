package com.mkpits.thread;

public class MultithreadingDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        

        MyThread t2 = new MyThread();
        t2.start();
    }
}
