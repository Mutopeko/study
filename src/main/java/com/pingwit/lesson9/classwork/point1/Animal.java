package com.pingwit.lesson9.classwork.point1;

public interface Animal {
    double WEIGHT = 1.5;
    String WEIGHT_STRING = "1.5";
    String eat();
    void sleep ();

    default void sound() {
        System.out.println("make a sound");
    }

    static void someStaticMethod() {
        System.out.println();
    }
}
