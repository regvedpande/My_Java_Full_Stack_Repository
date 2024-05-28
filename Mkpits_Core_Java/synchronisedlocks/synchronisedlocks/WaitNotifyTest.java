package com.mkpits.synchronisedlocks;

import com.mkpits.interthreadcommunication.Message;
import com.mkpits.interthreadcommunication.Notifier;
import com.mkpits.interthreadcommunication.Waiter;

public class WaitNotifyTest {
    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter, "waiter 1").start(); 

        Waiter waiter2 = new Waiter(msg);
        new Thread(waiter2, "waiter 2").start(); 

        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }
}
