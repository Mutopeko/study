package com.pingwit.lesson8.classwork.point3;

public enum Direction {

    NORTH("N", 77),
    SOUTH("S", 88),
    EAST("E", 64),
    WEST("W", 56);

    private String shortCode;
    private int randomNum;

    Direction(String shortCode, int randomNum) {
        this.shortCode = shortCode;
        this.randomNum = randomNum;
    }

    public String getShortCode() {
        return shortCode;
    }

    public int getRandomNum() {
        return randomNum;
    }
}
