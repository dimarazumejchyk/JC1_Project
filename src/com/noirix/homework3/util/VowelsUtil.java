package com.noirix.homework3.util;

public class VowelsUtil {
    public static boolean isVowel(char c) {

        char[] vowels = new char[]{'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'};

        for (char d : vowels)
        {
            if (c == d)
                return true;
        }
        return false;
    }

}
