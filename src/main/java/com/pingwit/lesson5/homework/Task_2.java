package com.pingwit.lesson5.homework;

public class Task_2 {
    /*
    Есть массив чисел. Найти среднее арифметическое число элементов массива
     */
    public static void main(String[] args) {
        int[] array = new int[5];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 10;
            sum += array[i];
        }
        System.out.println("Arithmetic mean = " + (sum / array.length));
    }
}
