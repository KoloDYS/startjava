package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex('m');
        wolf.setAge(6);
        wolf.setName("Cliff");
        wolf.setColor("grey");
        wolf.setWeight(40);

        System.out.println("Пол волка: " + wolf.getSex());
        System.out.println("Кличка волка: " + wolf.getName());
        System.out.println("Вес волка: " + wolf.getWeight());
        System.out.println("Возраст волка: " + wolf.getAge());
        System.out.println("Цвет окраски волка: " + wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}