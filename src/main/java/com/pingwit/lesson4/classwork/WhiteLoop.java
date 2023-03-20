package com.pingwit.lesson4.classwork;

public class WhiteLoop {
    public static void main(String[] args) {
        /* white (condition) {
        //code-code
        }
         */

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("======");
        /* do{
        //code
        }
        while(condition)
         */

        int x = 10;
        do {
            System.out.println(x);
            x++;
        } while (x < 15);

        System.out.println("======");

        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
        }

        System.out.println("======");

        int k = 10;
        while (k >= 0) {
            System.out.println(k);
            k--;
        }

        /* Бесконечный цикл
        for (; true; ) {
            System.out.println(0);
        }

         */
    }
}
