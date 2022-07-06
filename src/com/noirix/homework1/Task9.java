package com.noirix.homework1;

public class Task9 {
/*Объявить 2 переменных целого типа.
 Необходимо поменять значения переменных так,
  чтобы значение первой оказалось во второй, а второй - в первой. */

    public static void main(String[] args) {
        int a=5;
        int b=7;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
