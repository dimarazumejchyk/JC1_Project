package com.noirix.homework1;

public class Task15 {
    /*Выведете на экран все числа от 1 до 100 с помощью цикла
     (можно все три варианта в одной программе):for while do while*/
    public static void main(String[] args) {
        for (int f = 1; f <= 100; f++) {
            System.out.println("f= " +f);
        }

            int w=1;
            while (w<=100) {
                System.out.println("w= " + w);
                w++;
            }

        int dw=1;
            do {
                System.out.println("dw= " + dw);
                dw++;
            } while (dw<=100);
    }
}
