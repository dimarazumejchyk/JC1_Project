package com.noirix.homework.exception;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String myString = scanner.nextLine();

        try {
            int i = Integer.parseInt(myString.trim());

            System.out.println("int i*10 = " + i*10);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }




}
