package com.pingwit.lesson7.homework.task_1;

import java.math.BigDecimal;

/*
Создайте класс HarvestStatistic
String plant - название растения
BigDecimal totalWeight - общий вес урожая со всех полей
 */
public class HarvestStatistic {
    private String plant;
    private double totalWeight;


    public HarvestStatistic(String plant, double totalWeight) {
        this.plant = plant;
        this.totalWeight = totalWeight;
    }

    public String getPlant() {
        return plant;
    }

    public void setName(String plant) {
        this.plant = plant;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight() {
        this.totalWeight = totalWeight;
    }
}
