package com.pingwit.lesson9.homework.task1;

public class Dell implements Computer {
    @Override
    public void on() {
        System.out.println("DELL is On");
    }

    @Override
    public void off() {
        System.out.println("DELL is off");
    }

    @Override
    public void reset() {
        System.out.println("DELL is reseted");
    }
}
