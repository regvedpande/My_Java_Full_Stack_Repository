package com.mkpits.abstraction;

    class MilkyWay extends AbstractionPractice{

        public void Sun(){
            System.out.println("I am Star");
        }

        public void Saturn(){
            System.out.println("I Revolve Around You");
        }
    }

    
public class Main {
    public static void main(String[] args) {

        MilkyWay galaxy = new MilkyWay();
        galaxy.Sun();
        galaxy.Saturn();
    }
}