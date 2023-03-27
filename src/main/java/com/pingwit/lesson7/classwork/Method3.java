package com.pingwit.lesson7.classwork;

public class Method3 {
    public static void main(String[] args) {
        byte a = 27;
        byte b = 33;
        Method3 method3 = new Method3();
        int result = method3.sum(a, b, 45, 67);
        System.out.println(result);
    }

    public int sum(int... nums) {
        int sum = 0;
        for (int index : nums) {
            sum += index;
        }
        return sum;
    }
}
