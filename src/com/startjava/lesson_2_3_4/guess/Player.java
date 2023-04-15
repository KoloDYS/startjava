package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private final String name;
    private int attempt;
    private final int[] nums = new int[3];

    public Player(String name) {
        this.name = name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public boolean addNum(int num) {
        if (num <= 100 && num > 0) {
            nums[attempt++] = num;
            return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    @Override
    public String toString() {
        return name;
    }
}