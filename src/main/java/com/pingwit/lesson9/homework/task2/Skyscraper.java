package com.pingwit.lesson9.homework.task2;

public class Skyscraper extends Building{
    public Skyscraper(int numOfFloors, int numOfTenants) {
        super(numOfFloors, numOfTenants);
    }

    @Override
    public void heating() {
        System.out.println("heating is on");
    }

}
