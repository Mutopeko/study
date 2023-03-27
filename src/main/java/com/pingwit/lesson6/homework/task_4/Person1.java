package com.pingwit.lesson6.homework.task_4;
/*
Классу из 'Task 2' добавьте статическое приватное поле text = "Hello from static".
В другом классе, с методом main создайте несколько экземпляров класса из 'Task 2'. В одном из экземпляров измените значение
поля 'text' и затем выведите на экран поле 'text' у всех созданных объектов.
Если результат вас удивил, пересмотрите лекцию про static поля в классах
 */

//Возможно я не правильно понял задание(

public class Person1 {
    String name;
    int age;

    static String text;
    static {
        text = "Hello from static";
        System.out.println(text);
    }

    Person1(String personName, int age) {
        name = personName;
        this.age = age;
    }
    Person1(){
        name = "Misha";
        age = 23;
    }
    {
        System.out.println("New instance was created");
    }
    @Override
    public String toString() {
        return "Person[" + name + " ,age = " + age + "]";
    }
}
