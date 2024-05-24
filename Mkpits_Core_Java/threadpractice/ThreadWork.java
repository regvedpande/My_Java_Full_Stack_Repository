package com.mkpits.threadpractice;

//Fun Fact you can also use implements Runnable instead of both extends Thread
//start methods of below wont work then as runnable do not have it
/*  Car1 c = new Car1();
    Car2 c1 = new Car2();
    c.start();//error
    c1.start(); //error


    So how can we do it we can do it using Thread
    Thread t1 = new Thread();
    Thread t2 = new Thread();
    c.start();
    c1.start(); 

    Now, it will work but you wont get any output 😁 as the Thread do not know that c and c1 exists

    Thread has multiple Constructor and one of the Constructor takes Runnable Object which means t1 here is 
    actually a runnable object, so.
    Runnable c = new Runnable();
    Runnable c1 = new Runnable();
    Thread t1 = new Thread(c);
    Thread t2 = new Thread(c1);
    t1.start();
    t2.start(); 


    

    
    */


class Car1 extends Thread{
    public void run(){

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Bugatti");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class Car2 extends Thread{
    public void run(){

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Koenigsegg");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}

public class ThreadWork {
    public static void main(String[] args) {
    Car1 c = new Car1();
    Car2 c1 = new Car2();
    
    c1.setPriority(Thread.MAX_PRIORITY);
    c.start();
    c1.start();
    }
    
}
