package com.noirix.homework2;

import java.util.Arrays;
import com.noirix.homework2.CarUtil;

import static com.noirix.homework2.CarsBrandInterface.CAR_BRAND0;
import static com.noirix.homework2.CarsBrandInterface.CAR_BRAND1;

public class Main {

    public static void main(String[] args) {

        Car[] cars = CarUtil.carsArray();

        Car car0 = new Car();
        car0.setBrand(CAR_BRAND0);
        car0.setYearOfCreation(2003);
        Car car1 = new Car();
        car1.setBrand(CAR_BRAND1);
        car1.setYearOfCreation(2005);
        Car car2 = new Car();
        car2.setYearOfCreation(2001);
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car();

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


      Arrays.sort(cars);


        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
