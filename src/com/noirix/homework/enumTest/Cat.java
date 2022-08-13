package com.noirix.homework.enumTest;

public class Cat {

    private String name;
    private BloodType bloodType;

    private String breed;

    private String color;

    private int age;

    public Cat(String name, BloodType bloodType, String breed, String color, int age) {
        this.name = name;
        this.bloodType = bloodType;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bloodType=" + bloodType +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
