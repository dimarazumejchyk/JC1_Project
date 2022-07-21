package com.noirix.homework2;




public class Car implements  CarsMoveInterface, Comparable<Car> {
    private String brand;
    private String model;
    private String ownerFullName;
    private String color;
    private int yearOfCreation;
    private double engineVolume;
    private String typeOfEngine;
    private double fuelConsumption;

    public Car() {
    }

    public Car(String brand, String model, String ownerFullName, String color,
               int yearOfCreation, double engineVolume, String typeOfEngine, double fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.ownerFullName = ownerFullName;
        this.color = color;
        this.yearOfCreation = yearOfCreation;
        this.engineVolume = engineVolume;
        this.typeOfEngine = typeOfEngine;
        this.fuelConsumption = fuelConsumption;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ownerFullName='" + ownerFullName + '\'' +
                ", color='" + color + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", engineVolume=" + engineVolume +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfCreation != car.yearOfCreation) return false;
        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (Double.compare(car.fuelConsumption, fuelConsumption) != 0) return false;
        if (!brand.equals(car.brand)) return false;
        if (!model.equals(car.model)) return false;
        if (!ownerFullName.equals(car.ownerFullName)) return false;
        if (!color.equals(car.color)) return false;
        return typeOfEngine.equals(car.typeOfEngine);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = brand.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + ownerFullName.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + yearOfCreation;
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + typeOfEngine.hashCode();
        temp = Double.doubleToLongBits(fuelConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public int compareTo(Car o) {
        return this.getYearOfCreation() - o.getYearOfCreation();
    }

    @Override
    public void run() {
        System.out.println(this.brand+" "+this.model+"движется");
        
    }

    @Override
    public double consumption() {
        return this.fuelConsumption;
    }


}
