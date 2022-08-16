package com.noirix.homework.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class collectionTest {
    public static void main(String[] args) {
        int quantity = 999999;

        ArrayList<Dog> dogsArrayList = new ArrayList<>();
        long startArrayList = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            dogsArrayList.add(new Dog());
        }
        long finishArrayList = System.currentTimeMillis();
        System.out.println("время добавления в" + " dogsArrayList " + quantity + " объектов " +(finishArrayList - startArrayList) + "мс");
        long startRemoveArrayList = System.currentTimeMillis();
        dogsArrayList.remove(0);
        long finishRemoveArrayList = System.currentTimeMillis();
        System.out.println("время удаления первого элемента из " + " dogsArrayList " +(finishRemoveArrayList - startRemoveArrayList) + "мс");

        System.out.println("==========================");

        LinkedList<Dog> dogsLinkedList = new LinkedList<>();
        long startLinkedList = System.currentTimeMillis();
        for (int i = 0; i < quantity; i++) {
            dogsLinkedList.add(new Dog());
        }
        long finishLinkedList = System.currentTimeMillis();
        System.out.println("время добавления в" + " dogsLinkedList " + quantity + " объектов " + (finishLinkedList - startLinkedList) + "мс");
        long startRemoveLinkedList = System.currentTimeMillis();
        dogsLinkedList.remove(0);
        long finishRemoveLinkedList = System.currentTimeMillis();
        System.out.println("время удаления первого элемента из " + " dogsLinkedList " +(finishRemoveLinkedList - startRemoveLinkedList) + "мс");
     }
}
