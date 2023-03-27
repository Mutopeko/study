package com.pingwit.lesson7.classwork;

public class Method2 {
    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(3, 4, 8));
        System.out.println(sum(3.0, 3.5));
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }
}
