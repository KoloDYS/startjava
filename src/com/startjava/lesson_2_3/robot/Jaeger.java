package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String mark;
    private String origin;
    private int height;
    private int speed;
    private int armor;

    public Jaeger() {}

    public Jaeger(String mark, String origin, int height, int speed, int armor) {
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.speed = speed;
        this.armor = armor;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void increaseSpeed() {
        this.speed++;
    }

    public void decreaseSpeed() {
        this.speed--;
    }

    public void takeArmor() {
        System.out.println("броня надета");
    }

    public void removeArmor() {
        System.out.println("броня снята");
    }
}