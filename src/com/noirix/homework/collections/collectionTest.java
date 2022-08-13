package com.noirix.homework.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collectionTest {
    public static void main(String[] args) {
        int quantity = 111111;

        ArrayList<Dog> dogsArrayList = new ArrayList<>();

        long startArrayList = System.currentTimeMillis();


        for (int i = 0; i < quantity; i++) {
            dogsArrayList.add(new Dog());
        }

        long finishArrayList = System.currentTimeMillis();
        System.out.println("время добавления в" + " dogsArrayList " + quantity + " объектов " +(finishArrayList - startArrayList) + "мс");

 //       for (Dog dogTemp : dogsArrayList) {
 //           System.out.println(dogTemp);
 //       }

        System.out.println("==========================");

        LinkedList<Dog> dogsLinkedList = new LinkedList<>();

        long startLinkedList = System.currentTimeMillis();


        for (int i = 0; i < quantity; i++) {
            dogsLinkedList.add(new Dog());
        }

        long finishLinkedList = System.currentTimeMillis();

        System.out.println("время добавления в" + " dogsLinkedList " + quantity + " объектов " + (finishLinkedList - startLinkedList) + "мс");


        //       for (Dog dogTemp : dogsLinkedList) {
 //           System.out.println(dogTemp);
 //       }


   /*      ArrayList<Integer> objects = new ArrayList<>();
         objects.add(10);
         objects.add(14);
         objects.add(78);
         objects.add(55);
         objects.add(44);
         objects.add(79);
         objects.add(99);
         objects.trimToSize();
        for (Integer object : objects) {
            System.out.println(object);
        }
        System.out.println("size is " + objects.size());
        System.out.println("remove 3 and 0");
         objects.remove(3);
         objects.remove(0);
        for (Integer obj : objects) {
            System.out.println(obj);
        }
        System.out.println("size is " + objects.size());
*/
    }

}
