package com.noirix;

import com.noirix.domain.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "siam", "Black", 3, 4D);

        String catName = cat.name;
        System.out.println(catName);

        System.out.println(cat.name);
        System.out.println(cat.breed);
        System.out.println(cat.color);
        System.out.println(cat.catConstant);

        int sum = cat.getSum(100, 2);
        System.out.println(sum);
        cat.someMethod();

        System.out.println(cat.toString());
//        System.out.println(cat.age);
//        System.out.println(cat.weight);
//
//        Cat copyOfCat = new Cat("Barsik", "Black", 3, 4D);
//        Cat cat1 = new Cat("Baton", "Red", 5, 10D);
    }
}
