package com.noirix.homework1;

public class Task5 {
/*5. Вывести на  экран все нечетные цифры от 1 до 15
 (используйте остаток от деления) */
public static void main(String[] args) {
    for (int i = 1; i <= 15; i++) {
        int x=i%2;
        if (x>0)
            System.out.println(i);

        
    }
    
    }
}
