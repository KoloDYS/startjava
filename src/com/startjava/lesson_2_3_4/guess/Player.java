package com.startjava.lesson_2_3_4.guess;

public class Player {
    private final String name;
    private int index = 0;
    private int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }
    public int[] getArray() {
        return nums;
    }
    public void setNum(int num) {
        nums[index++] = num;
    }
    public int getNum() {
        return nums[index - 1];
    }
    public void nullIndex() {
        index = 0;
    }
    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return name;
    }
}