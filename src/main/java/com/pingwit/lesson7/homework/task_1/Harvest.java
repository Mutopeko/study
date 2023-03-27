package com.pingwit.lesson7.homework.task_1;

import java.math.BigDecimal;

/*
Создайте класс Harvest, в котором будут храниться данные об урожае на ферме.
У Harvest есть поля
Long id - уникальный идентификатор
String field - название поля, с которого был собран урожай (урожаев за год может быть несколько собрано с одного поля)
String plant - название растения (рожь, пшеница, клубника, картошечка и т.д.)
BigDecimal weight - вес собранного урожая
 */
public class Harvest {

    private long id;
    private String field;
    private String plant;
    private double weight;

    public Harvest(long id, String field, String plant, double weight) {
        this.id = id;
        this.field = field;
        this.plant = plant;
        this.weight = weight;
    }
    public Harvest(String plant, double weight) {
        this.plant = plant;
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }
}
