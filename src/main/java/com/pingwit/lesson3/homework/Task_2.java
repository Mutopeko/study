package com.pingwit.lesson3.homework;

public class Task_2 {
    /*
    Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
    сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
     */
    public static void main(String[] args) {
        int ameba = 1;
        int numOfHours = 24;
        for (int i = 1; i <= numOfHours; i +=3) {
            ameba = ameba * 2;
        }
        System.out.println(ameba);
    }
}
