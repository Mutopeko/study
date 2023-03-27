package com.pingwit.lesson7.classwork;

public class Main2 {
    public static void main(String[] args) {
        Car audi = new Car("audi");
        audi.setModel("audi");
        System.out.println(audi.getModel());
        audi.setModel("bmw");
        System.out.println(audi.getModel());
    }
}
