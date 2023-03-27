package com.pingwit.lesson6.classwork;

public class Student {
    String name;
    String surname;
    int age;
    static String classname;

    static {
        System.out.println("Static init block");
        classname = "java - 6";
    }

    {
        name = "Undefined";
        age = 18;
    }

    Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{ name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age=+ + age +" +
                '}';
    }
}
