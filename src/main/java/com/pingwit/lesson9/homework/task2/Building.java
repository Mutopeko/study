package com.pingwit.lesson9.homework.task2;
/*
Task 2(abstract class)
Есть два типа домов - городская многоэтажка и загородный дом.
У каждого типа дома есть методы "получить кол-во этажей", "включить отопление",
"получить кол-во жильцов".
Есть каталог домов (например класс, внутри которого какой-то массив).
Создайте каталог и поместите туда несколько домов.

 */

public abstract class Building {

    private int numOfFloors;
    private int numOfTenants;

    public Building(int numOfFloors, int numOfTenants) {
        this.numOfFloors = numOfFloors;
        this.numOfTenants = numOfTenants;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public int getNumOfTenants() {
        return numOfTenants;
    }

    public abstract void heating();
}
