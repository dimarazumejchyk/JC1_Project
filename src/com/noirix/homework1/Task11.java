package com.noirix.homework1;

import java.util.Scanner;

public class Task11 {
    /*Напишите программу с тремя переменными целого типа.
     Определить какое из них наибольшее*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a =scanner.nextInt();
        System.out.println("Введите второе число");
        int b =scanner.nextInt();
        System.out.println("Введите третье число");
        int c =scanner.nextInt();


            if (a>b && a>c)
            System.out.println("max="+a);

        else
                if (b > a && b > c)

                    System.out.println("max=" + b);

        else if (c>a && c>b)

            System.out.println("max="+c);



    }
}
