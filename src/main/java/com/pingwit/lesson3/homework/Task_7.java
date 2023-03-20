package com.pingwit.lesson3.homework;

public class Task_7 {
    /*
    Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
     */
    public static void main(String[] args) {
        int oddNum = 100;
        for (int i = 0; i < oddNum; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
