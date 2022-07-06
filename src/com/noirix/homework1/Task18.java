package com.noirix.homework1;

import java.util.Scanner;

public class Task18 {
    /*Напишите метод переводящий рубли в доллары по заданному курсу.
    В качестве аргументов укажите кол-во рублей и курс*/
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + " " + args[i]);
        }
        for (String temp : args) {
            System.out.println(temp);
        }
        float d=1000/2.52f;
        System.out.println(d);

    }
}
