package com.mkpits.array;

public class ArrayPractice4 {

  public static void main(String[] args) {

    String[] copyFrom = {"Koenigsegg", "Hennesey Venom", "Pagani", "ApolloIE", "Ferrari",
      "Lamborghini", "Mclaren", "Maserati", "Lotus"};

    String cars[] = new String [7];//
    
    //We are assigning copy of copyFrom range to cars
    System.arraycopy(copyFrom, 2, cars, 0, 7);
    
    for (String c : cars) {
		System.out.println(c);
	}

    
  }
}