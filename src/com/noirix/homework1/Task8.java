package com.noirix.homework1;

public class Task8 {
    /*Пройти циклом по числам от 1 до 12 и вывести название месяца,
    соответствующее каждому числу (используя цикл и оператор if else) */
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            String month=null; // непонятно почему нужно инициализировать

            if (i==1) month="january";
            else if (i==2) month="february";
            else if (i==3) month="march";
            else if (i==4) month="april";
            else if (i==5) month="may";
            else if (i==6) month="june";
            else if (i==7) month="july";
            else if (i==8) month="august";
            else if (i==9) month="september";
            else if (i==10) month="october";
            else if (i==11) month="november";
            else if (i==12) month="december";


            System.out.println(month);



        }

    }
}
