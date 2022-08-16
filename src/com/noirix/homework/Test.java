package com.noirix.homework;

class Test {

        public static void main(String[] args) {
            print(3);
        }

        private static void print(int n) {


            if (n == 0)
                return;


            System.out.println(n);
            print(n-1);


    }
}
