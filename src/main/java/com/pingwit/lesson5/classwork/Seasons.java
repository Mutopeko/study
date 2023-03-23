package com.pingwit.lesson5.classwork;

import java.util.Arrays;

public class Seasons {
    public static void main(String[] args) {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println(seasons[0]);
        System.out.println(seasons.length - 1);
        System.out.println(seasons[seasons.length - 1]);

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println(seasons); // ошибка

        System.out.println(Arrays.toString(seasons));
    }
}
