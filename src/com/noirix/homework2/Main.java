package com.noirix.homework2;

import com.noirix.homework2.Car;

public class Main {
    /*(String brand, String model, String ownerFullName, int yearOfCreation, float engineVolume)*/
    public static void main(String[] args) {
        Car car1 = new Car("Renault", "Scenic2", "Dmitry_Razumejchyk", 2005, 1.9);
        Car car2 = new Car("Renault", "Scenic2", "Vadim_Buko", 2008, 1.5);
        Car car3 = new Car("Volkswagen", "PassatCC", "Dmitry_Kozhuch", 2008, 2.0);
        Car car4 = new Car("Volkswagen", "Tiguan", "Vadim_Buko", 2018, 2.0);
        Car car5 = new Car();

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getOwnerFullName());
        car5.setOwnerFullName("Vova_Selivanov");
        System.out.println(car5.getOwnerFullName());

 //       System.out.println(car1.toString());
 //       System.out.println(car1.hashCode());
 //       double cost1 = car1.cost100(2.44, 6);
 //       System.out.println("стоимость 100 км пути " + cost1 + " руб");
 //       car1.someMethod();
//
 //       System.out.println(car2.toString());
 //       System.out.println(car2.hashCode());
 //       double cost2 = car2.cost100(2.44, 5);
 //       System.out.println("стоимость 100 км пути " + cost2 + " руб");
 //       car2.someMethod();
//
 //       System.out.println(car1.equals(car2));
//
 //       System.out.println(car3.toString());
 //       System.out.println(car3.hashCode());
 //       double cost3 = car3.cost100(2.48, 8);
 //       System.out.println("стоимость 100 км пути " + cost3 + " руб");
 //       car3.someMethod();
    }
}
