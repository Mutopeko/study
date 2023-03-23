package com.pingwit.lesson5.classwork;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[2][3];
        //{1, 2, 3}
        twoDimArray[0][0] = 1;
        twoDimArray[0][1] = 2;
        twoDimArray[0][2] = 3;
        //{4, 5, 6}
        twoDimArray[1][0] = 4;
        twoDimArray[1][1] = 5;
        twoDimArray[1][2] = 6;
        /*
        {1, 2, 3}
        {4, 5, 6}
         */
        System.out.println(twoDimArray.length);
        System.out.println(twoDimArray[0].length);
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=============");
        for (int i = 0; i < twoDimArray.length; i++) {
            System.out.println(Arrays.toString(twoDimArray[i]));
        }
    }
}
