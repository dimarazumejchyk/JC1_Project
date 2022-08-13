package com.noirix.homework3.util;

import com.noirix.homework3.domain.Student;

import java.util.Random;

public class StudentUtil {

    public static Student generateStudent(){
        Student student = new Student();
        student.setNumber(numberGenerate());
        student.setName(nameGenerate(8));
        student.setLastName(lastNameGenerate(10));
        return student;
    }
    static int i = 0;
    public static int numberGenerate (){
        i++;
        return i;
    }

    public static String nameGenerate(int length) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(31);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
    public static String lastNameGenerate(int length) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(31);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

}
