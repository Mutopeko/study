package com.pingwit.lesson4.homework;

import java.util.Scanner;

public class Task_4 {
    /*
    Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
     */
    public static void main(String[] args) {
        int oddNum = 1;
        int maxOddNum = 100;
        while (oddNum <= maxOddNum) {
            if (oddNum % 2 != 0) {
                System.out.println(oddNum);
            }
            oddNum++;
        }

        //===================

        int oddNum1 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum odd number: ");
        int maxOddNum1 = scanner.nextInt();
        while (oddNum1 <= maxOddNum1) {
            if (oddNum1 % 2 != 0) {
                System.out.println(oddNum1);
            }
            oddNum1++;
        }
    }
}
