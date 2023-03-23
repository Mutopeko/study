package com.pingwit.lesson5.classwork;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int[] initArrow = {0, 40, 5, 5};

        for (int index : initArrow) {
            System.out.println(index);
        }
        System.out.println("===========");

        String[] cars = {"Volvo", "BMW", "Mazda", "Ford"};
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println("============");

        System.out.println(Arrays.toString(initArrow));
        System.out.println(Arrays.toString(cars));
    }
}
