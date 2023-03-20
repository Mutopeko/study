package com.pingwit.lesson4.homework;

public class Task_1 {
    /*
    Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */
    public static void main(String[] args) {

        int ameba = 1;
        int hours = 0;
        while (hours <= 24) {
            System.out.println(ameba);
            hours += 3;
            ameba *= 2;
        }
    }
}
