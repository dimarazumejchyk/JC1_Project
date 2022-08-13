package com.noirix.homework2;

import com.noirix.homework2.domain.Car;
import com.noirix.homework2.service.CarsMoveInterface;
import com.noirix.homework2.util.CarUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car[] cars = CarUtil.carsArray(10);

        Arrays.sort(cars);
        for (Car carTemp : cars) {
            System.out.println(carTemp);
        }


        CarsMoveInterface carsMoveInterface = new Car();
        carsMoveInterface.run();
        carsMoveInterface.consumption();

    }
}
