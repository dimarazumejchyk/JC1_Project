package com.noirix.homework1;

public class Task17 {
    /*Все элементы массива поделить на значение наибольшего элемента этого массива*/
    public static void main(String[] args) {

        int nums[] = {39, 14, 17, 45, 79, 87, 44, 43, 99, 28};


            float max=nums[0];
            float d;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max)
                max=nums[i];
        }
        System.out.println("max=" + max);

        for (int i = 0; i < nums.length; i++) {
            d=nums[i]/max;
            System.out.println("i=" + i + " nums[i/max]=" + d);

        }
    }
}

