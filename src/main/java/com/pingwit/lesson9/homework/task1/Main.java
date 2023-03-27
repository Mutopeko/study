package com.pingwit.lesson9.homework.task1;

public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Dell();
        comp1.on();
        comp1.off();
        comp1.reset();
        System.out.println();

        Computer comp2 = new HP();
        comp2.on();
        comp2.off();
        comp2.reset();
        System.out.println();

        Computer comp3 = new Lenovo();
        comp3.on();
        comp3.off();
        comp3.reset();
    }

    public static void print(Computer computer) {
        computer.on();
        computer.off();
        computer.reset();
    }
}
