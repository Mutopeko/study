package com.pingwit.lesson7.classwork;

public class Operations {
    public static int sum(int... nums) {
        int sum = 0;
        for (int index : nums) {
            sum += index;
        }
        return sum;
    }

    public static int sub(int... nums) {
        int sub = 0;
        for (int index : nums) {
            sub -= index;
        }
        return sub;
    }

    public static double div(int... nums) {
        double div = nums[0];
        for (int i = 1; i < nums.length; i++) {
            div /= nums[i];
        }
        return div;
    }

    public static int mult(int... nums) {
        int result = 1;
        for (int index : nums) {
            result *= index;
        }
        return result;
    }
}
