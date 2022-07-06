package com.noirix.homework1;

import java.util.Arrays;

public class Task2 {
    /*Напишите метод, который будет увеличивать каждый элемент массива на 10%*/
 public static void main(String[] args) {

     float nums [];
     nums = new float[9];
     nums[0]=11;
     nums[1]=22;
     nums[2]=33;
     nums[3]=44;
     nums[4]=55;
     nums[5]=67;
     nums[6]=76;
     nums[7]=77;
     nums[8]=88;

     System.out.println("   исходный массив " + Arrays.toString(nums));

     for (int i = 0; i < nums.length; i++) {
         nums[i]= (float) (nums[i] * 1.1);
     }
     System.out.println("увеличенный на 10% " + Arrays.toString(nums));
 }
}
