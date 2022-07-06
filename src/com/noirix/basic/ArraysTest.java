package com.noirix.basic;

public class ArraysTest {
    public static void main(String[] args) {

        int[] arrayWithDefinedValues = {1, 3, 5, 7, 10};

        int[] array = new int[10];

        System.out.println(array.length);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[8]);

        /*Show all elements of array with index of element*/
        for (int i = 0; i < array.length; i++) {
            System.out.println("Cell " + i + " has value " + array[i]);
        }

        /*Show all elements*/
        for (int i : array) {
            System.out.println("For each element " + i);
        }

        /*Show all elements*/
        for (int arrayWithDefinedValue : arrayWithDefinedValues) {
            System.out.println(arrayWithDefinedValue);
        }


    }
}
