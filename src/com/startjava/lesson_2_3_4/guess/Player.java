package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int playerAttempt;
    private int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public void addNum(int num) {
        nums[playerAttempt++] = num;
    }

    public int getNum() {
        return nums[playerAttempt - 1];
    }

    public void nullAttempts() {
        playerAttempt = 0;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums,getAttempts());
    }

    public int getAttempts() {
        return playerAttempt;
    }

    public void nullArray() {
        Arrays.fill(nums, 0, playerAttempt, 0);
    }

    @Override
    public String toString() {
        return name;
    }
}