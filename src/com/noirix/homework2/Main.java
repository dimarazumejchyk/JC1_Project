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

    }
}
