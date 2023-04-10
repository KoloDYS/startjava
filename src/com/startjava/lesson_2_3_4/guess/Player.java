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

    public void nullplayerAttempts() {
        playerAttempt = 0;
    }

    public int getplayerAttempts() {
        return playerAttempt;
    }

    public void outputAndNullArray() {
        int[] copyArray = Arrays.copyOf(nums,playerAttempt);
        for (int num : copyArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.fill(nums, 0, playerAttempt, 0);
    }

    @Override
    public String toString() {
        return name;
    }
}