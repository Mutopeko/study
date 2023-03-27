package com.pingwit.lesson9.classwork.point1;

public class Cat implements Animal {

    public void abra() {
        System.out.println("Cat specific metod");
    }

    @Override
    public String eat() {
        return "I'm cat and I like to eat!";
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}
