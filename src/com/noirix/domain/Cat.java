package com.noirix.domain;

public class Cat {

    public static int count = 0;

    /*Поля класса = характеристики*/
    public String name = "default name";

    public String breed = "default breed";

    public String color = "default color";

    private int age = 1;

    private double weight = 3;

    public final String catConstant = "Meow";

    /*Каким образом создавать объекты*/
    public Cat() {
    }

    public Cat(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    /*@Overriding*/
    /*equals, hashCode, toString*/

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", catConstant='" + catConstant + '\'' +
                '}';
    }

    /*Поведение класса = поведением объекта = методы*/
    public void someMethod() {
        /*тело метода*/
        System.out.println("Some method process");
    }

    /*
        Перегрузка
        Сигнатура метода = название метода + параметры метода(их число, тип и очередность)
        */

    public int getSum(int a, int b) {
        return a + b;
    }

    public double getSum(double a, double b) {
        return a + b;
    }

    public int getSum(byte a, byte b) {
        return a + b;
    }

}
