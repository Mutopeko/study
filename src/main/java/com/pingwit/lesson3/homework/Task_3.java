package com.pingwit.lesson3.homework;

public class Task_3 {
    /*
    Вычислить: 1+2+4+8+...+256
     */
    public static void main(String[] args) {
        int sum = 0;
        int max = 256;
        for (int i = 1; i <= max; i *= 2) {
            sum += i;//sum = sum + i
        }
        System.out.println(sum);

    }
}
