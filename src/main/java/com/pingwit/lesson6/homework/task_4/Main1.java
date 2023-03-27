package com.pingwit.lesson6.homework.task_4;

public class Main1 {
    public static void main(String[] args) {
        Person1 misha = new Person1();
        Person1 ololo = new Person1("ololo", 19);
        Person1 artem = new Person1("artem", 33);
        Person1 sergey = new Person1("sergey", 35);
        misha.text += " + new text";

        System.out.println(misha);
        System.out.println(ololo);
        System.out.println(Person1.text);
    }
}
