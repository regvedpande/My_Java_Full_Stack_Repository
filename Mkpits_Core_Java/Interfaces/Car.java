package com.mkpits.Interfaces;

public abstract class Car 
{
     public abstract void engine();
     public abstract void steeringwheel();
     public abstract void battery();
     public abstract void windshieldwipers();
    
}

class Honda extends Car{

    
    public void engine() {
        System.out.println("4 Stroke Engine");
    }

    
    public void steeringwheel() {
       System.out.println("Simple Steering Wheel");
    }

   
    public void battery() {
        System.out.println("14 Volts");
    }

   
    public void windshieldwipers() {
        System.out.println("Doble Basic Windshields");
    }

}

class BMW extends Car
{

   
    public void engine() {
        System.out.println("V8 ");
    }

    @Override
    public void steeringwheel() {
        System.out.println("Sport type");
        
    }

    @Override
    public void battery() {
        System.out.println("20 volt");
    }

    @Override
    public void windshieldwipers() {
       System.out.println("Advanced");
    }

    
}

class CarMain
{
    public static void main(String[] args)
     {
        System.out.println("Honda Car Specification");
      Honda h=new Honda();
      h.engine();
      h.battery();
      h.steeringwheel();  

      System.out.println("BMW specificatio ");
      BMW b=new BMW();
      b.battery();
      b.engine();
      b.steeringwheel();
    }
}
