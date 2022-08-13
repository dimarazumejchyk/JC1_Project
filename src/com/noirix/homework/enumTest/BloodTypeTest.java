package com.noirix.homework.enumTest;

public class BloodTypeTest {
    public static void main(String[] args) {
        System.out.println(BloodType.FIRST_P);
        System.out.println(BloodType.FIRST_P.ordinal());
        System.out.println(BloodType.FIRST_P.getRhFactor());
        System.out.println(BloodType.FIRST_M);
        System.out.println(BloodType.FIRST_M.ordinal());
        System.out.println(BloodType.FIRST_M.getRhFactor());
        System.out.println(BloodType.SECOND_P);
        System.out.println(BloodType.SECOND_P.ordinal());
        System.out.println(BloodType.SECOND_P.getRhFactor());
        System.out.println(BloodType.SECOND_M);
        System.out.println(BloodType.SECOND_M.ordinal());
        System.out.println(BloodType.SECOND_M.getRhFactor());
        System.out.println(BloodType.THIRD_P);
        System.out.println(BloodType.THIRD_P.ordinal());
        System.out.println(BloodType.THIRD_P.getRhFactor());
        System.out.println(BloodType.THIRD_M);
        System.out.println(BloodType.THIRD_M.ordinal());
        System.out.println(BloodType.THIRD_M.getRhFactor());
        System.out.println(BloodType.FOURTH_P);
        System.out.println(BloodType.FOURTH_P.ordinal());
        System.out.println(BloodType.FOURTH_P.getRhFactor());
        System.out.println(BloodType.FOURTH_M);
        System.out.println(BloodType.FOURTH_M.ordinal());
        System.out.println(BloodType.FOURTH_M.getRhFactor());


       Cat cat = new Cat("Barsik", BloodType.FOURTH_P, "scottish", "red", 4);
       Cat cat1 = new Cat("Basilar", BloodType.FIRST_P,  "siam", "black", 3);
      System.out.println(cat.toString());
      System.out.println(cat1.toString());
    }
}
