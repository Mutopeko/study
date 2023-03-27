package com.pingwit.lesson6.homework.task_2;
/*
Создайте класс, у которого будут поля имя и возраст.
У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
который присваивает значения по умолчанию для имени и возраста.
Добавьте в класс блок инициализации, который будет выводить на экран сообщение о том, что создали новый экземпляр класса.
 */

public class Person {
    String name;
    int age;

    Person(String personName, int age) {
        name = personName;
        this.age = age;
    }
    Person(){
        name = "Misha";
        age = 23;
    }
    {
        System.out.println("New instance was created");
    }

    @Override
    public String toString() {
        return "Person[" + name + " ,age = " + age + "]";
    }
}
