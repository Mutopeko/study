package com.pingwit.lesson9.classwork.point2;

public class Bicycle extends Vehicle{
    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("I'm driving bicycle");
    }
}
