package com.noirix.homework2;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String ownerFullName;
    private int yearOfCreation;
    private double engineVolume;

    public Car() {
    }

    public Car(String brand, String model, String ownerFullName, int yearOfCreation, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.ownerFullName = ownerFullName;
        this.yearOfCreation = yearOfCreation;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerFullName() {
        return ownerFullName;
    }

    public void setOwnerFullName(String ownerFullName) {
        this.ownerFullName = ownerFullName;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    // c - цена за литр, е - расход, cost100 - расходы на 100 км пробега.

    public int cost100(byte c, byte e) {
        return c * e;
    }

    public int cost100(int c, int e) {

        return c * e;
    }

    public double cost100(double c, double e) {

        return c * e;
    }

    public void someMethod() {
        /*тело метода*/
        System.out.println("someMethod");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfCreation != car.yearOfCreation) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        if (model != null ? !model.equals(car.model) : car.model != null) return false;
        return ownerFullName != null ? ownerFullName.equals(car.ownerFullName) : car.ownerFullName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (ownerFullName != null ? ownerFullName.hashCode() : 0);
        result = 31 * result + yearOfCreation;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
