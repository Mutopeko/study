package com.pingwit.lesson9.classwork.point2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", "super");
        print(car);

        Vehicle car2 = new Car("Audi", "super");
        print(car2);

        Vehicle bic = new Bicycle("139-A");
        print(bic);

     //   Vehicle vehicle = new Vehicle(); -- не получится
        System.out.println(car.equals(car2));
        System.out.println(car.equals(bic));
    }

    public static void print(Vehicle vehicle) {
        System.out.println(vehicle.getName());
        vehicle.drive();
    }
}
