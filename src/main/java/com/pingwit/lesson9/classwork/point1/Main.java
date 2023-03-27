package com.pingwit.lesson9.classwork.point1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.abra();
        System.out.println(cat.eat());
        cat.sleep();
        cat.sound();

        Dog dog = new Dog();
        System.out.println(dog.eat());
        dog.sleep();

        System.out.println("================");

        Animal cat2 = new Cat();
        System.out.println(cat2.eat());
        cat2.sleep();

        Animal dog2 = new Dog();
        // cat.abra(); -- через Animal нельзя
        System.out.println(dog2.eat());
        dog2.sleep();
    }
}
