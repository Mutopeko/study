package com.pingwit.lesson1;

public class JavaOperations {
    public static void main(String[] args) {

        //Сложение/Вычитание

        int num1 = 100;
        int num2 = 100;

        int sum = num1 + num2;
        int sub = num1 - num2;
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);

        //Деление

        int num3 = 33;
        int div = num1 / num3;
        float divFl = num1 / num3;
        System.out.println("Division = " + div);
        System.out.println("Division = " + divFl);

        int myInt = 100;
        myInt += 10; // myInt = myInt + 10;
        System.out.println("myInt = " + myInt);
        System.out.println("myInt++ = " + myInt++); // myInt = myInt + 1
        System.out.println("++myInt = " + ++myInt); // myInt = myInt + 1, 111 + 1

        System.out.println("Float sum: " + (1.45f + 1.58f));
        System.out.println("Double sum: " + (1.45 + 1.58));

        System.out.println("0 / 0 = " + 0f / 0);
        System.out.println("12.0 / 0 = " + 12.0 / 0);
        System.out.println("-12.0 / 0 = " + -12.0 / 0);

        byte x = 20;
        byte y = 30;
        y += x; // y = y + x
        System.out.println("x + y = " + y);

        boolean myBool = 2 > 4;
        System.out.println("2 > 4 = " + myBool);
        boolean myBool2 = 3 < 7;
        System.out.println("3 < 7 = " + myBool2);
        boolean myBool3 = 3 <= 3;
        System.out.println("3 <= 3 = " + myBool3);
        boolean myBool4 = 3 == 3;
        System.out.println("3 == 3 = " + myBool4);

    }
}
