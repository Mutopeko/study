package com.pingwit.lesson9.homework.task1;

import com.pingwit.lesson9.homework.task1.Computer;

public class HP implements Computer {

    @Override
    public void on() {
        System.out.println("HP is On");
    }

    @Override
    public void off() {
        System.out.println("HP is off");
    }

    @Override
    public void reset() {
        System.out.println("HP is reseted");
    }
}
