package com.pingwit.lesson7.homework.task_1;

import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        Harvest harvest1 = new Harvest(1, "Potato 1", "potato", 203.33);
        Harvest harvest2 = new Harvest(2, "Potato 2", "potato", 105.25);
        Harvest harvest3 = new Harvest(3, "Carrot 1", "carrot", 86.10);
        Harvest harvest4 = new Harvest(4, "Carrot 2", "carrot", 45.86);
        Harvest harvest5 = new Harvest(5, "Carrot 3", "carrot", 35.36);
        Harvest harvest6 = new Harvest(6, "Cabbage 1", "cabbage", 130.65);
        Harvest harvest7 = new Harvest(7, "Cabbage", "cabbage", 120.76);

        Harvest[] array = new Harvest[7];
        array[0] = harvest1;
        array[1] = harvest2;
        array[2] = harvest3;
        array[3] = harvest4;
        array[4] = harvest5;
        array[5] = harvest6;
        array[6] = harvest7;
    }
}
