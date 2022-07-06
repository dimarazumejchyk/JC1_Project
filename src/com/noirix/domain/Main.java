package com.noirix.domain;

import com.noirix.domain.Car;

public class Main {
    /*(String brand, String model, String ownerFullName, int yearOfCreation, float engineVolume)*/
    public static void main(String[] args) {
        Car car1 = new Car("Renault", "Scenic2","Dmitry_Razumejchyk",2005,1.9);
        Car car2 = new Car("Renault", "Scenic2","Vadim_Buko",2008,1.5);
        Car car3 = new Car("Volkswagen", "PassatCC","Dmitry_Kozhuch",2008,2.0);
        Car car4 = new Car("Volkswagen", "Tiguan","Vadim_Buko",2018,2.0);


        System.out.print(car1.brand + " ");
        System.out.println(car1.model);
        System.out.println(car1.ownerFullName);
        System.out.println(car1.yearOfCreation);
        System.out.println(car1.engineVolume);

        double cost1 = car1.cost100(2.44, 6);
        System.out.println("стоимость 100 км пути " + cost1 + " руб");
        car1.someMethod();

 /*       System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.ownerFullName);
        System.out.println(car2.yearOfCreation);
        System.out.println(car2.engineVolume);

        double cost2 = car2.cost100(2.44, 5);
        System.out.println("стоимость 100 км пути " + cost2 + " руб");

        System.out.println(car3.brand);
        System.out.println(car3.model);
        System.out.println(car3.ownerFullName);
        System.out.println(car3.yearOfCreation);
        System.out.println(car3.engineVolume);

        double cost3 = car3.cost100(2.44, 8);
        System.out.println("стоимость 100 км пути " + cost3 + " руб");

        System.out.println(car4.brand);
        System.out.println(car4.model);
        System.out.println(car4.ownerFullName);
        System.out.println(car4.yearOfCreation);
        System.out.println(car4.engineVolume);

        double cost4 = car4.cost100(2.44, 7);
        System.out.println("стоимость 100 км пути " + cost4 + " руб");

         */
    }


}
