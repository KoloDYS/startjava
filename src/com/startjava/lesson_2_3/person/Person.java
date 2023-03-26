package com.startjava.lesson_2_3.person;

public class Person {
    String name = "Vladimir";
    String sex = "male";
    double height = 1.81;
    int weight = 74;
    int age = 25;

    void go() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + "сидит");
    }

    void run() {
        System.out.println(name + " бегает");
    }

    void speak() {
        System.out.println(name + "говорит: Мой возраст - " + age + " лет");
    }

    void learn() {
        System.out.println(name + " учит Java");
    }
}