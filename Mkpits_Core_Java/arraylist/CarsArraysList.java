package com.mkpits.arraylist;

import java.util.ArrayList;

public class CarsArraysList {
    public static void main(String[] args) {
        ArrayList<String> carsname1 = new ArrayList<>();
        carsname1.add("Car Name : Koenigsegg Jesko Absolut");
        carsname1.add("Car Name : Koenigsegg Agers RS");
        carsname1.add("Car Name : Pagani HP Barchetta");
        carsname1.add("Car Name : Apollo IE");
        carsname1.add("Car Name : Bugatti Chiron Super Sport 300+");

        ArrayList<String> carsname2 = new ArrayList<>();
        carsname2.add("| Launch Year : 2020");
        carsname2.add("| Launch Year : 2015");
        carsname2.add("| Launch Year : 2017");
        carsname2.add("| Launch Year : 2017");
        carsname2.add("| Launch Year : 2019");

       // Using a for-each loop to iterate through the lists
       for (String carName : carsname1) {
        System.out.println(carName + "  " + carsname2.get(carsname1.indexOf(carName)));
    }
        // for (int i = 0; i < carsname1.size(); i++) {
        //     System.out.println(carsname1.get(i) + "  " + carsname2.get(i));
        // }
    }
}

