package com.pingwit.lesson4.homework;

import java.util.Scanner;

public class Task_5 {
    /*
    Даны числа от 0 до 100.
 - Посчитать сумму четных и вывести на экран
 - Посчитать сумму нечетных и вывести на экран
 - Найти общую сумму всех чисел
     */
    public static void main(String[] args) {
        int evenNum = 1;
        int evenMax = 100;
        int evenSum = 0;
        while (evenNum <= evenMax) {
            if (evenNum % 2 == 0) {
                evenSum += evenNum;
            }
            evenNum++;
        }
        System.out.println("Sum of even numbers = " + evenSum);

        int oddNum = 1;
        int oddMax = 100;
        int oddSum = 0;
        while (oddNum < oddMax) {
            if (oddNum % 2 != 0) {
                oddSum += oddNum;
            }
            oddNum++;
        }
        System.out.println("Sum of odd numbers = " + oddSum);
        System.out.println("The sum of even and odd numbers = " + (evenSum + oddSum));

        System.out.println("=================");

        int evenNum1 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the maximum even number: ");
        int evenMax1 = scanner.nextInt();
        int evenSum1 = 0;
        while (evenNum1 <= evenMax1) {
            if (evenNum1 % 2 == 0) {
                evenSum1 += evenNum1;
            }
            evenNum1++;
        }
        System.out.println("Sum of even numbers = " + evenSum1);

        int oddNum1 = 1;
        System.out.println("Enter the maximum odd number: ");
        int oddMax1 = scanner.nextInt();
        int oddSum1 = 0;
        while (oddNum1 < oddMax1) {
            if (oddNum1 % 2 != 0) {
                oddSum1 += oddNum1;
            }
            oddNum1++;
        }
        System.out.println("Sum of odd numbers = " + oddSum1);
        System.out.println("The sum of even and odd numbers = " + (evenSum1 + oddSum1));
    }
}
