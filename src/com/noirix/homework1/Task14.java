package com.noirix.homework1;

public class Task14 {
    /*Создайте программу с двумя переменными целого типа, присвойте им значения,
     если первая переменная больше второй, то увеличьте её значение на 3,
      иначе увеличьте значение второй переменной на 8.
     В конце программы выведите значения обоих чисел на экран*/
    public static void main(String[] args) {
        int a=5, b=9;
        if (a>b)
            a+=3;
        else b+=8;
        System.out.println(a);
        System.out.println(b);

    }
}
