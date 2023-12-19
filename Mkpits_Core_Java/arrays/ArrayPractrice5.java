package com.mkpits.array;

import java.util.Arrays;

public class ArrayPractrice5 {

  public static void main(String[] args) {

String[] cars = {"Koenigsegg", "Hennesey Venom", "Pagani", "ApolloIE", "Ferrari",
	    	      "Lamborghini", "Mclaren", "Maserati", "Lotus"};

//For the custom range of cars
    String newCars [] = Arrays.copyOfRange(cars,2, 5);
    
    for (String carList : newCars) {
      System.out.println("Car name is: " + carList);
    }
  }
}