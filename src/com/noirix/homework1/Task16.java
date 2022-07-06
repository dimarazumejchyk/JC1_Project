package com.noirix.homework1;

import java.util.Scanner;

public class Task16 {
    /*Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
     Например, если минимум 10, максимум 35, шаг 5,
     то вывод должен быть таким: 10 15 20 25 30 35.
      Минимум, максимум и шаг указываются пользователем (можно захардкодить).*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимум");
        int min =scanner.nextInt();
        System.out.println("Введите максимум");
        int max =scanner.nextInt();
        System.out.println("Введите шаг");
        int s =scanner.nextInt();
        int i;

        for ( i = min; i <= max; i+=s) {
            System.out.println(i);

        }
    }
}
