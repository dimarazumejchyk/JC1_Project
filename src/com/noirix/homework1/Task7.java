package com.noirix.homework1;

public class Task7 {
    /*Посчитать сумму цифр от 20 до 200 и
      результат вывести на экран (используя цикл for)*/
    public static void main(String[] args) {
        int s=0;

        for ( int i = 20; i <= 200; i++) {

//            System.out.println("i=" + i);

           s += i;



        }
        System.out.println("сумма равна " + s);
    }
    

}
