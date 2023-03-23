package com.pingwit.lesson5.classwork;

public class ArrayExample {
    public static void main(String[] args) {
        //type [] anArray
        int[] array;
        array = new int[10];

        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000;

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 100;
            System.out.println(array[i]);

            System.out.println("=========");
            System.out.println(array[0]);
            System.out.println(array[1]);
            //....

            int[] anArray = {100, 101, 505, 29};
            System.out.println(anArray.length);
        }
    }
}
