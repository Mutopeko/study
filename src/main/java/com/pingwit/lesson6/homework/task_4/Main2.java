package com.pingwit.lesson6.homework.task_4;

public class Main2 {
    public static void main(String[] args) {
        Person1 artem = new Person1("artem", 30);
        Person1.text += " 123";
        System.out.println(artem);
        System.out.println(Person1.text);
    }
}
