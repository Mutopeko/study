package com.pingwit.lesson3.homework;

public class Task_3 {
    /*
    Вычислить: 1+2+4+8+...+256
     */
    public static void main(String[] args) {
        int num = 1;
        int max = 256;
        for (int i = 1; i <= max; i *= 2) {
            num = num + num;

        }
        System.out.println(num);

    }
}
