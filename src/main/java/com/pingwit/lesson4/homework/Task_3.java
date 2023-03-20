package com.pingwit.lesson4.homework;

import java.util.Scanner;

public class Task_3 {
    /*
    Напишите программу вывода всех четных чисел от 2 до 100 включительно
     */
    public static void main(String[] args) {
        int evenNum = 1;
        int maxEvenNum = 100;
        while (evenNum <= maxEvenNum) {
            if (evenNum % 2 == 0) {
                System.out.println(evenNum);
            }
            evenNum++;
        }

        //===================

        int evenNum1 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum even number: ");
        int maxEvenNum1 = scanner.nextInt();
        while (evenNum1 <= maxEvenNum1) {
            if (evenNum1 % 2 == 0) {
                System.out.println(evenNum1);
            }
            evenNum1++;
        }
    }
}
