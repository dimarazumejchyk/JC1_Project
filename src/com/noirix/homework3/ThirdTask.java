package com.noirix.homework3;

import com.noirix.homework3.domain.Book;
import com.noirix.homework3.util.BookUtil;
import com.noirix.homework3.util.PrintUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ThirdTask {
    public static void main(String[] args) {

        LinkedList<Book> unsortedBooks = BookUtil.generateListBook(25);

        List<Book> sortedByLastAuthorsName = new LinkedList<Book>();
        sortedByLastAuthorsName.addAll(unsortedBooks);
        Collections.sort(sortedByLastAuthorsName, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getLastNameAuthorsName().compareTo(o2.getLastNameAuthorsName());
            }
        });
        System.out.println(sortedByLastAuthorsName.size() + " Books sorted By Last Authors Name:");
        PrintUtil.print(sortedByLastAuthorsName);

        List<Book> sortedByAuthorsName = new LinkedList<Book>();
        sortedByAuthorsName.addAll(unsortedBooks);
        Collections.sort(sortedByAuthorsName, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getAuthorsName().compareTo(o2.getAuthorsName());
            }
        });
        System.out.println(sortedByAuthorsName.size() + " Books sorted By Authors Name:");
        PrintUtil.print(sortedByAuthorsName);


        List<Book> sortedByPatronymicAuthorsName = new LinkedList<Book>();
        sortedByPatronymicAuthorsName.addAll(unsortedBooks);
        Collections.sort(sortedByPatronymicAuthorsName, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getPatronymicAuthorsName().compareTo(o2.getPatronymicAuthorsName());
            }
        });
        System.out.println(sortedByPatronymicAuthorsName.size() + " Books sorted By Patronymic Authors Name:");
        PrintUtil.print(sortedByPatronymicAuthorsName);


















    }
}
