package com.noirix.homework1;

public class Task12 {
    /*Напишите программу,
    в которой используются две переменные логического типа (boolean),
    присвойте им значения и выведете для каждой переменной на экран
    строку "истина", если переменная имеет значение true и
    "ложь", если переменная имеет значение false*/
    public static void main(String[] args) {
        boolean a,b;

        a = true;
        System.out.println("если a равна " + a);
        if (a==true) System.out.println("истина");
        a = false;
        System.out.println("если a равна " + a);
        if (a!=true) System.out.println("ложь");

        b = true;
        System.out.println("если b равна " + b);
        if (b) System.out.println("истина");
        b = false;
        System.out.println("если b равна " + b);
        if (!b) System.out.println("ложь");

    }
}
