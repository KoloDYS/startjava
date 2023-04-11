package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void guessNumber() {
        Random random = new Random();
        int targetNum = random.nextInt(1, 101);

        System.out.println("Игра “Угадай число”");
        System.out.println("У каждого игрока по 10 попыток");
        while (true) {
            if (tryGuess(player1, targetNum) || tryGuess(player2, targetNum)) {
                break;
            }

            if (player2.getAttempts() == 10 && player1.getAttempts() == 10) {
                System.out.println("Попытки закончились у обоих игроков.");
                break;
            }
        }
        System.out.println("Конец игры!");
        System.out.println("Числа игроков: ");
        System.out.print(player1 + ": ");
        outputArray(player1);
        player1.nullArray();
        player1.nullAttempts();

        System.out.print(player2 + ": ");
        outputArray(player2);
        player2.nullArray();
        player2.nullAttempts();
    }

    private static boolean tryGuess(Player player, int targetNum) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ход игрока " + player + "\nВведите число от 1 до 100");
        player.addNum(scan.nextInt());
        if (isGuessed(player, targetNum)) {
            return true;
        }
        checkEndAttempts(player);
        return false;
    }

    private static boolean isGuessed(Player player, int targetNum) {
        if (player.getNum() == targetNum) {
            System.out.println("Игрок " + player + " угадал число " + targetNum + " c " +
                    player.getAttempts() + " попытки." );
            return true;
        }
        if (player.getNum() > targetNum) {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        }
        return false;
    }

    private static void checkEndAttempts(Player player) {
        if (player.getAttempts() == 10) {
            System.out.println("У " + player + " закончились попытки");
        }
    }

    private static void outputArray(Player player) {
        for (int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}