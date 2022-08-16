package com.noirix.homework3;

import com.noirix.homework3.domain.Book;
import com.noirix.homework3.util.BookUtil;
import com.noirix.homework3.util.PrintUtil;

import java.util.LinkedList;

public class FirstTask {
    public static void main(String[] args) {

        LinkedList<Book> linkedBooks = BookUtil.generateListBook(20);

        System.out.println("Source LinkedList size " + linkedBooks.size());
        PrintUtil.print(linkedBooks);

        linkedBooks.remove(6);
        System.out.println("Deleting 7 books");

        System.out.println("Final LinkedList size " + linkedBooks.size());
        PrintUtil.print(linkedBooks);
    }
}
