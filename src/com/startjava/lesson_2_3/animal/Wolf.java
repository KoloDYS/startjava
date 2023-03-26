package com.startjava.lesson_2_3.animal;

public class Wolf {
    private char sex;
    private String name;
    private int weight;
    private int age;
    private String color;

    public void setSex(char sex) {
        if (sex == 'm' || sex == 'f') {
            this.sex = sex;
        } else {
            System.out.println("Введенный вами пол некорректен");
        }
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Значение введенного веса некорректно");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 0 && age < 8) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Некорректный возраст");
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void go() {
        System.out.println("\nИдет");
    }

    public void sit() {
        System.out.println("\nСидит");
    }

    public void run() {
        System.out.println("\nБежит");
    }

    public void howl(){
        System.out.println("\nВоет");
    }

    public void hunt() {
        System.out.println("\nОхотится");
    }
}