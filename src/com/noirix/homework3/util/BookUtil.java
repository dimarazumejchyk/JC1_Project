package com.noirix.homework3.util;

import com.noirix.homework3.domain.Book;

import java.util.LinkedList;
import java.util.Random;

public class BookUtil {

    public static LinkedList<Book> generateListBook(int listCapacity) {

        LinkedList<Book> bookLinkedList = new LinkedList<>();

        for (int i = 0; i <= listCapacity; i++) {

            Book book = new Book();

            bookLinkedList.add(book);

            book.setTitle(generateTitle(12));
            book.setLastNameAuthorsName(generateLastNameAuthors());
            book.setAuthorsName(generateAuthorsName());
            book.setPatronymicAuthorsName(generatePatronymicAuthorsName());
            book.setYearOfPublication(generateYearOfPublication());
            book.setRandomString(generateRandomString(10));
        }
        return bookLinkedList;
    }

    public static Book generateBook() {

            Book book = new Book();

            book.setTitle(generateTitle(12));
            book.setLastNameAuthorsName(generateLastNameAuthors());
            book.setAuthorsName(generateAuthorsName());
            book.setPatronymicAuthorsName(generatePatronymicAuthorsName());
            book.setYearOfPublication(generateYearOfPublication());
            book.setRandomString(generateRandomString(10));

        return book;
    }

    public static String generateTitle(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(31);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }



    private static String generateLastNameAuthors() {
        String[] arrayLastNameAuthors = {"Andrews", "Backer", "Clarkson", "May", "Hammond" };
        Random random = new Random();
        int n = random.nextInt(arrayLastNameAuthors.length);
        return arrayLastNameAuthors[n];
    }

    private static String generateAuthorsName() {
        String[] arrayAuthorsName = {"Oliver", "Garry", "Jack", "George", "Henry" };
        Random random = new Random();
        int n = random.nextInt(arrayAuthorsName.length);
        return arrayAuthorsName[n];
    }

    private static String generatePatronymicAuthorsName() {
        String[] arrayPatronymicAuthorsName = {"Jonny", "Connor", "Owen", "Ronny", "Tommy" };
        Random random = new Random();
        int n = random.nextInt(arrayPatronymicAuthorsName.length);
        return arrayPatronymicAuthorsName[n];
    }

    public static int generateYearOfPublication() {
        int min = 1900;
        int max = 2020;
        int x = (int) (Math.random() * ((max - min) + 1) + min);
        return x;
    }

    public static String generateRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }




}