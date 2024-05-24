package com.mkpits.workerthread;

public class MyWorkerThread implements Runnable {
    private String message;

    public MyWorkerThread(String s) {
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processTask();
        System.out.println(Thread.currentThread().getName() + " (End)");
    }

    private void processTask() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
