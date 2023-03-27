package com.pingwit.lesson9.homework.task2;

public class Catalog {
    public static void main(String[] args) {
        Skyscraper building1 = new Skyscraper(30, 300);
        Cottage building2 = new Cottage(2, 6);
        Skyscraper building3 = new Skyscraper(40, 400);
        Cottage building4 = new Cottage(3, 10);

        Building[] buildings = {building1, building2, building3, building4};
    }
}
