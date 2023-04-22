package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int START_RANGE = 1;
    public static final int END_RANGE = 101;
    public static final int NUM_ATTEMPTS = 10;
    private final int[] nums = new int[NUM_ATTEMPTS];
    private final String name;
    private int attempt;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public int getAttempt() {
        return attempt;
    }

    public int getScore() {
        return score;
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, attempt);
    }

    public int getNum() {
        return nums[attempt - 1];
    }

    public boolean addNum(int num) {
        if (num >= START_RANGE && num < END_RANGE) {
            nums[attempt++] = num;
            return true;
        }
        return false;
    }

    public void increaseScore() {
        score++;
    }

    public void clear() {
        Arrays.fill(nums, 0, attempt, 0);
        attempt = 0;
    }

    public void nullifyScore() {
        score = 0;
    }

    @Override
    public String toString() {
        return name;
    }
}