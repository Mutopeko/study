package com.pingwit.lesson3.homework;

public class Task_4 {
    /*
    Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
     */
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int mul = 0;
        for (int i = 0; i < num1; i++) {
            mul = mul + num2;
        }
        System.out.println(mul);
    }
}
