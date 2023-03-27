package com.pingwit.lesson9.classwork.point1;

public class Dog implements Animal {
    @Override
    public String eat() {
        return "I'm dog and I like to eat!";
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
