package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int attempt;
    private int winCounter;
    private final int[] nums = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getWinCounter() {
        return winCounter;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public boolean addNum(int num) {
        if (num > 0 && num <= 100) {
            nums[attempt++] = num;
            return true;
        }
        return false;
    }

    public void increaseWinCounter() {
        winCounter++;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    public void nullWinCounter() {
        winCounter = 0;
    }

    @Override
    public String toString() {
        return name;
    }
}