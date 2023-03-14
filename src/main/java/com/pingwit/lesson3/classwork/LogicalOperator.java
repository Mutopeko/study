package com.pingwit.lesson3.classwork;

public class LogicalOperator {
    public static void main(String[] args) {
        //& - AND, | - OR (хотя бы 1 true), ! - NOT, && - AND, || - OR (хотя бы 1 true)
        boolean a = true;
        boolean b = false;
        //&,&&
        boolean c1 = a & b; // проверяет все
        System.out.println(c1);
        boolean c11 = a && b; // проверяет до первого значения false
        System.out.println(c11);
        // |,||
        boolean c2 = a | b; // проверит все
        System.out.println(c2);
        boolean c22 = a || b; // проверит до первого значения true
        System.out.println(c22);
        // !
        boolean c3 = !a | b;
        System.out.println(c3);
        System.out.println(!a);

        System.out.println(!(2 < 5));
        System.out.println(false & (2 < 5));
        System.out.println((7 < 5) & true);
        System.out.println((2 > 5) || true);
        System.out.println((2 < 5) || false);

    }
}
