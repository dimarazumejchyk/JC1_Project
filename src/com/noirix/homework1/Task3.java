package com.noirix.homework1;

public class Task3 {
    /*Напишите метод,
    который будет проверять является ли число палиндромом
    (одинаково читающееся в обоих направлениях)*/
    public static void main(String[] args) {
        int[] a = {5,8,9,8,5,1};
        boolean isPalindrom = true;
        for(int i=0; i < a.length;i++) {
            if(a[i] != a[a.length-i-1]){
                isPalindrom=false;
                break;
                }
        }
        System.out.println( isPalindrom ? "Это палиндром ":" Это не палиндром");
    }

}
