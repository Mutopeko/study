package com.pingwit.lesson3.homework;

public class Task_8 {
    /*
    Даны числа от 0 до 100.
- Посчитать сумму четных и вывести на экран
- Посчитать сумму нечетных и вывести на экран
- Найти общую сумму всех чисел
     */
    public static void main(String[] args) {
        int numEven = 100;
        int sumEven = 0;
        for (int i = 0; i <= numEven; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            }
        }
        System.out.println(sumEven);

        int numOdd = 100;
        int sumOdd = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven + sumOdd);
    }
}
