package com.pingwit.lesson3.homework;

public class Task_1 {
    /*
    Task 1
    Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
    день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
    суммарный путь пробежит спортсмен за 7 дней?
     */
    public static void main(String[] args) {

        double totalKm = 10;
        double totalKm2 = totalKm * 0.1;

        for (int i = 1; i <= 7; i++) {
            totalKm = totalKm + (totalKm + totalKm2);
        }
        System.out.println(totalKm);
    }
}
