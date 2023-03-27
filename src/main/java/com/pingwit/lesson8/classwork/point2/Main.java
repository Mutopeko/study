package com.pingwit.lesson8.classwork.point2;

import com.pingwit.lesson8.classwork.point1.Person;

public class Main {
    public static void main(String[] args) {
        Person alesya = new Person("Alesya", 11);
        Person kate = new Person("Kate", 11);

        boolean isEqual = alesya == kate;
        System.out.println(alesya.equals(kate));
        System.out.println(alesya.hashCode());
    }
}
