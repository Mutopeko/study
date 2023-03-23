package com.pingwit.lesson5.homework;

import java.util.Scanner;

public class Task_1 {
    /*
    Создать массив из 3 элементов. При помощи класса сканер и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран
     */
    public static void main(String[] args) {
        int[] array = new int[3];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println("Sum = " + sum);
    }
}
