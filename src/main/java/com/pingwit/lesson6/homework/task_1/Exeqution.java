package com.pingwit.lesson6.homework.task_1;

public class Exeqution {
    static String msg;

    static {
        msg = "static";
        System.out.println(msg);
    }

    {
        msg = "regular";
        System.out.println(msg);
    }
    Exeqution() {
        msg = "Constructor value";
        System.out.println(msg);
    }


    public static void main(String[] args) {
        Exeqution abc = new Exeqution();
        System.out.println(abc.msg);
    }
}

