package com.pingwit.lesson8.homework.task1;
/*
Создать класс Warehouse, внутри которого массив класса Box (с любыми полями - например name, weight - сделать его через record).
Массив должен быть immutable
При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после этого нельзя.
В классе должен быть метод next() который возвращает следующий элемент массива.
Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
также должен быть метод getArray() - который возвращает массив и переопределен метод toString()
 */

import java.util.Arrays;

public class Warehouse {
    private Box[] boxes;

    public Warehouse(Box[] boxes) {

        this.boxes = boxes;
    }

    public Box[] getBoxes() {

        return boxes.clone();
    }

  /*  public Box next() {
        Box[] box = new Main(boxes) {
                for (int index : box)
        }
        return Main(boxes);
    }*/

    @Override
    public String toString() {
        return "Warehouse{" +
                "boxes = " + Arrays.toString(boxes) +
                "}";
    }
}
