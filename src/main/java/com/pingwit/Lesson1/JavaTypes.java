package com.pingwit.Lesson1;

public class JavaTypes {
    public static void main(String[] args) {
        byte age = 55;

        byte number;
        number = 44;

        //byte 2^8 -> 2^7-1
        byte num2 = 127;

        //2^16
        //char 2^16-1 -> max 0-65535
        short num3 = 33;

        System.out.println(age);

        int num4 = 787878787;
        System.out.println(num4);

        char myCharNumber = 33;
        System.out.println(myCharNumber);
        char myCharSymbol = 'K';
        System.out.println(myCharSymbol);
        char myCharUtf = '\u4756';
        System.out.println(myCharUtf);


        //float, double
        float myFloat = 2.15f;
        float myFloat2 = 10;
        System.out.println(myFloat);
        System.out.println(myFloat2);

        double myDouble = 55.89;
        double myDouble2 = 55;
        System.out.println(myDouble);
        System.out.println(myDouble2);

        //String

        String myString = "Lesson 1";
        System.out.println(myString);

        //boolean

        boolean myBoolean = true;
        System.out.println(myBoolean);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
