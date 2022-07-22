package com.noirix.homework2.util;

import com.noirix.homework2.domain.Car;

import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND0;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND1;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND3;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND4;

public class CarUtil {

    public static Car[] carsArray() {

        int carsQuantity = 10;

        Car[] cars = new Car[carsQuantity];

        Car car0 = new Car();
        car0.setBrand(CAR_BRAND0);
        car0.setYearOfCreation(2003);
        Car car1 = new Car();
        car1.setBrand(CAR_BRAND1);
        car1.setYearOfCreation(2005);
        Car car2 = new Car();
        car2.setYearOfCreation(2001);
        Car car3 = new Car(CAR_BRAND3,"TOLEDO","Qwerty","silver",2007,2.0,"gasoline",8.8);
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car(CAR_BRAND4,"ALMERA","Ytrewq","black",2014,1.8,"gasoline", 7.9);

        cars[0]=car0;
        cars[1]=car1;
        cars[2]=car2;
        cars[3]=car3;
        cars[4]=car4;
        cars[5]=car5;
        cars[6]=car6;
        cars[7]=car7;
        cars[8]=car8;
        cars[9]=car9;


        return cars;
    }


}
