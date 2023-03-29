package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return name;
    }
}