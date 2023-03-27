package com.pingwit.lesson6.classwork;

public class Main {
    public static void main(String[] args) {
        Student egor = new Student("Egor", "Petrov", 23);
        Student kostya = new Student("Kostya", "Petrov", 25);
        Student liza = new Student("Liza", "Petrova");

        Demo demo1 = new Demo();
        System.out.println("I'm in MAIN METHOD");
        System.out.println("percentage demo1 = " + Demo.percentage);
        System.out.println("count demo1 " + Demo.count);

        Demo.count++;
        Demo.percentage++;

        Demo demo2 = new Demo();
        System.out.println("percentage demo2 = " + Demo.percentage);
        System.out.println("count demo2 = " + Demo.count);
    }
}
