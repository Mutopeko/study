package com.pingwit.lesson4.homework;

import java.util.Scanner;

public class Task_1_2 {
    /*
    Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */
    public static void main(String[] args) {
        int ameba = 1;
        int hours = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of hours: ");
        int max = scanner.nextInt();

        while (hours <= max) {
            hours += 3;
            ameba *= 2;
        }
        System.out.println(ameba);

    }
}
