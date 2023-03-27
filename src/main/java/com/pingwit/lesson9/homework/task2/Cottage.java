package com.pingwit.lesson9.homework.task2;

public class Cottage extends Building{
    public Cottage(int numOfFloors, int numOfTenants) {
        super(numOfFloors, numOfTenants);
    }

    @Override
    public void heating() {
        System.out.println("heating is on");
    }

}
