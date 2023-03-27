package com.pingwit.lesson9.classwork.point1;

public class Main2 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        print(cat);

        Dog dog = new Dog();
        print(dog);

        System.out.println("===============");

        Animal cat2 = new Cat();
        print(cat2);

        Animal dog2 = new Dog();
        print(dog2);
    }

    public static void print(Animal animal) {
        System.out.println(animal.eat());
        animal.sleep();
    }
}
