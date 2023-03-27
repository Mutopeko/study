package com.pingwit.lesson6.homework.task_3;

import com.pingwit.lesson6.homework.task_2.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("misha", 23);
        person[1] = new Person("artem", 30);
        person[2] = new Person("sergey", 25);
        System.out.println(Arrays.toString(person));
    }
}
