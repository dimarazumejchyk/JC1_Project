package com.noirix.homework3;

import com.noirix.homework3.domain.Book;
import com.noirix.homework3.domain.Student;
import com.noirix.homework3.util.BookUtil;
import com.noirix.homework3.util.VowelsUtil;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SecondTask {
    public static void main(String[] args) {

        Set<Book> hashBooks = new HashSet<>();
        int booksQuantity;
        for ( booksQuantity = 0; booksQuantity < 25; booksQuantity++) {
            hashBooks.add(BookUtil.generateBook());
        }
        System.out.println("HashSet size is " + hashBooks.size());
        System.out.println("====================");

        for (Book tempBook: hashBooks) {
            char[] chArr = tempBook.getTitle().toCharArray();
            if (VowelsUtil.isVowel(chArr[0])) {
               System.out.println(tempBook);
            }
        }

        hashBooks.stream().sorted();

        System.out.println("+++++++++++++++++++++++++++++++");

        TreeSet<Book> treeSetBooks = new TreeSet<>();
        treeSetBooks.addAll(hashBooks);
        for (Object tempBook: treeSetBooks) {
            System.out.println(tempBook);
        }
        System.out.println("TreeSet size is " + treeSetBooks.size());













    }
}
