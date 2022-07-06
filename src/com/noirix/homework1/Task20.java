package com.noirix.homework1;

import java.util.Scanner;

public class Task20 {
    /*Напишите программу,
     которая будет считать количество часов,
      минут и секунд в n-ном количестве суток*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество суток");
        int n = scan.nextInt();
        int h = n*24;
        int m = h*60;
        int s = m*60;
        System.out.println("В " + n + " суток " + h + " часов " + m + " минут и " + s + " секунд");
    }
}
