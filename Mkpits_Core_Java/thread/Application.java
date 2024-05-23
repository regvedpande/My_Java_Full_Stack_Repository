package com.mkpits.thread;

public class Application {

    public static void main(String[] args) {
        // Creating and starting the first thread using MyThread
        MyThread m1 = new MyThread();
        m1.start();

        // Creating and starting the second thread using MyThread2
        MyThread2 m2 = new MyThread2();
        Thread t1 = new Thread(m2);
        t1.start();
    }
}
