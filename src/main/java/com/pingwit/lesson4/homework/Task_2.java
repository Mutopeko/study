package com.pingwit.lesson4.homework;

import java.util.Scanner;

public class Task_2 {
    /*
    Вычислить: 1+2+4+8+...+256
     */
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <= 256) {
            num = num * 2;
            sum =+ num;
        }
        System.out.println(sum);


        // ================

        int num1 = 1;
        int sum1 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the final number: ");
        int max = scanner.nextInt();

        while (num1 <= max) {
            num1 = num1 * 2;
            sum1 =+ num1;
        }
        System.out.println(sum1);
    }
}
