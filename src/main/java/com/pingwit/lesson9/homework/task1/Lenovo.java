package com.pingwit.lesson9.homework.task1;

import com.pingwit.lesson9.homework.task1.Computer;

public class Lenovo implements Computer {
    @Override
    public void on() {
        System.out.println("Lenovo is On");
    }

    @Override
    public void off() {
        System.out.println("Lenovo is off");
    }

    @Override
    public void reset() {
        System.out.println("Lenovo is reseted");
    }
}
