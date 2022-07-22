package com.noirix.homework2.util;

import com.noirix.homework2.domain.Car;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND0;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND1;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND2;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND3;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND4;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND5;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND6;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND7;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND8;
import static com.noirix.homework2.service.CarsBrandInterface.CAR_BRAND9;
import java.util.Random;;

public class CarUtil {

    public static Car[] carsArray(int carsQuantity) {

            Car[] cars = new Car[carsQuantity];

            Car car0 = new Car(CAR_BRAND0, "535", "Tyuiop", "black", 2000, 3,"diesel",7);
            Car car1 = new Car(CAR_BRAND1, "Q7", "Sdfghj", "white", 2017, 4.2,"diesel",8.7);
            Car car2 = new Car(CAR_BRAND2, "Touran", "Zxcvb", "black", 2003, 2.2,"diesel",8.7);
            Car car3 = new Car(CAR_BRAND3,"212","Qwerty","silver",2007,2.0,"gasoline",8.8);
            Car car4 = new Car(CAR_BRAND4, "ALMERA", "Cvbnm", "silver", 2009, 1.8,"diesel",8.7);
            Car car5 = new Car(CAR_BRAND5, "Corolla", "Oiuyrt", "white", 2011, 2.7,"diesel",8.7);
            Car car6 = new Car(CAR_BRAND6, "Punto", "Asdfgh", "orange", 2005, 1.2,"gasoline",8.7);
            Car car7 = new Car(CAR_BRAND7, "Megane", "Plmnhyt", "silver", 2021, 3.2,"gasoline",8.7);
            Car car8 = new Car(CAR_BRAND8, "TOLEDO", "Thnbvfr", "white", 2018, 2.2,"gasoline",8.7);
            Car car9 = new Car(CAR_BRAND9,"Transit","Ytrewq","red",2001,1.9,"diesel", 7.9);

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
