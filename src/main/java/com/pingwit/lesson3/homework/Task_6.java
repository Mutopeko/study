package com.pingwit.lesson3.homework;

public class Task_6 {
    /*
    Напишите программу вывода всех четных чисел от 2 до 100 включительно
     */
    public static void main(String[] args) {
        int evenNum = 100;
        for (int i = 1; i <= evenNum; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
