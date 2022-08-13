package com.noirix.homework3.util;

import java.util.Collection;


public class PrintUtil {
    public static <E> void print(Collection<E> listForPrint) {
        for (E e:listForPrint) {
            System.out.println(e);
        }

    }
}
