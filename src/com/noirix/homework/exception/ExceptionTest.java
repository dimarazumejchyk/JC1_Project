package com.noirix.homework.exception;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String myString = scanner.nextLine();
        System.out.println(myString);

        try {
            // именно здесь String преобразуется в int
            int i = Integer.parseInt(myString.trim());

            // выведем на экран значение после конвертации
            System.out.println("int i = " + i);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }




}
