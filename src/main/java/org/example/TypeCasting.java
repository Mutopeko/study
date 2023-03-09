package org.example;

public class TypeCasting {
    public static void main(String[] args) {
        //automatic
        byte myByte = 120;
        short myShort = myByte;

        byte myByte2 = 120;
        byte myByte3 = 30;
        float sumOfBytes = myByte2 + myByte3;

        //manual
        myByte = (byte) myShort;
        System.out.println(myByte);

        //


    }
}
