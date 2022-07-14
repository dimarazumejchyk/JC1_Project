package com.noirix.homework2;

public class Main {

    public static void main(String[] args) {

        Car car0 = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();
        Car car7 = new Car();
        Car car8 = new Car();
        Car car9 = new Car();

        Car [] cars = new Car[10];

        cars[0] = car0;
        cars[1] = car1;
        cars[2] = car2;
        cars[3] = car3;
        cars[4] = car4;
        cars[5] = car5;
        cars[6] = car6;
        cars[7] = car7;
        cars[8] = car8;
        cars[9] = car9;
        for (Car tempCar : cars) {
            System.out.println(tempCar);
        }




/*      System.out.println(car0.toString());
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        System.out.println(car6.toString());
        System.out.println(car7.toString());
        System.out.println(car8.toString());
        System.out.println(car9.toString()); */


//        CarUtil carUtil = new CarUtil();
//        CarUtil.carsArray();


    }
}
