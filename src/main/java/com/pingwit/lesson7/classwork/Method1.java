package com.pingwit.lesson7.classwork;

public class Method1 {
    public static void main(String[] args) {
        int a = 17;
        int b = 22;
        int result = sum(a, b);
        System.out.println(result);
        int result1 = sum(a, b, 33, 22, 11, 18);
        System.out.println(result1);
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
    public static int sum(int... nums) {
        int sum = 0;
        for (int index : nums) {
            sum += index;
        }
        return sum;
    }
    public static byte sum2(int a, int b) {
        byte result = (byte) (a + b);
        return result;
    }
}
