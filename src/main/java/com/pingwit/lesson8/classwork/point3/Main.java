package com.pingwit.lesson8.classwork.point3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Fruit.APPLE);
        System.out.println(Fruit.BANANA);
        Fruit mango = Fruit.MANGO;
        mango = Fruit.ORANGE;
        System.out.println(mango);

        System.out.println("===========");

        Direction north = Direction.NORTH;
        System.out.println(north);
        Direction south = Direction.SOUTH;
        System.out.println(south);
        Direction east = Direction.EAST;
        System.out.println(east);
        Direction west = Direction.WEST;
        System.out.println(west);
        System.out.println(north.getRandomNum());
        System.out.println(north.getShortCode());
    }
}
