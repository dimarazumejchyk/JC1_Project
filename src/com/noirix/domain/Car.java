package com.noirix.domain;

public class Car {
    public String brand;
    public String model;
    public String ownerFullName;
    public int yearOfCreation;
    public double engineVolume;

    public Car() {
    }

    public Car(String brand, String model, String ownerFullName, int yearOfCreation, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.ownerFullName = ownerFullName;
        this.yearOfCreation = yearOfCreation;
        this.engineVolume = engineVolume;
    }
// c - цена за литр, е - расход, cost100 - расходы на 100 км пробега.

    public int cost100(byte c, byte e) {
        return c*e;
    }

    public int cost100(int c, int e) {
        return c*e;
    }

    public double cost100(double c, double e) {
        return c*e;
    }

    public void someMethod() {
        /*тело метода*/
        System.out.println("цена и расход вводятся для каждого авто");
    }


}
