package com.noirix.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш вес");

//        сила тяжести на луне равна 16% от силы тяжести на земле

        float e = scanner.nextFloat();
        float m;

        m=e*0.16f;
        System.out.println("Ваш вес на луне равен " + m +" kg");
    }
}
