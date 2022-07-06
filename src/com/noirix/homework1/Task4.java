package com.noirix.homework1;
//Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)
public class Task4 {
    public static void main(String[] args) {
       for (int i = 1; i <= 100; i++) {
           int x;
           x = i%2;

           if (x<=0)
               System.out.println(i);

//            int x = 42;
//            double y =42.25;

//            System.out.println("x mod 10 = " + x%10);
//            System.out.println("y mod 10 = " + y%10);



        }
    }
}
