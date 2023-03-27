package com.pingwit.lesson6.homework.task_4;

import com.pingwit.lesson6.homework.task_2.Person;

public class Main1 {
    public static void main(String[] args) {
        Person1 misha = new Person1();
        Person1 ololo = new Person1("ololo", 19);

        System.out.println(misha);
        System.out.println(ololo);
        System.out.println(Person1.text);
    }
}
