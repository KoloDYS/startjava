package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final int NUM_PLAYERS = 3;
    private static final int NUM_ROUNDS = 3;
    private final Player[] players = new Player[NUM_PLAYERS];
    private int targetNum;

    public GuessNumber(Player... player) {
        for (int i = 0; i < NUM_PLAYERS; i++) {
            players[i] = player[i];
        }
    }

    public void guessNumber() {
        Random random = new Random();
        System.out.println("Игра “Угадай число”");
        System.out.println("У каждого игрока по 10 попытки. Победитель выявляется по результатам 3 раундов.");
        shufflePlayers();
        for (int i = 0; i < NUM_ROUNDS; i++) {
            System.out.println("Раунд №" + (i + 1));
            targetNum = random.nextInt(Player.START_RANGE, Player.END_RANGE);
            while (!tryGuess()) {
                if (players[2].getAttempt() == Player.NUM_ATTEMPTS) {
                    System.out.println("Попытки закончились у всех игроков.");
                    break;
                }
            }
            System.out.println("Конец раунда!");
            System.out.println("Числа игроков: ");
            for (int j = 0; j < NUM_PLAYERS; j++) {
                printPlayerAttempts(players[j]);
                players[j].clear();
            }
        }
        outputInfoWinner();
    }

    private void shufflePlayers() {
        for (int i = 0; i < NUM_PLAYERS; i++) {
            int j = (int) (Math.random() * NUM_PLAYERS);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private boolean tryGuess() {
        for (Player player : players) {
            System.out.println("Ход игрока " + player + "\nВведите число от 1 до 100");
            inputNum(player);
            if (isGuessed(player)) {
                return true;
            }
            checkEndAttempts(player);
        }
        return false;
    }

    private void inputNum(Player player) {
        Scanner scan = new Scanner(System.in);
        while (!player.addNum(scan.nextInt())) {
            System.out.println("Введите допустимое число");
        }
    }

    private boolean isGuessed(Player player) {
        int lastNum = player.getNum();
        if (lastNum == targetNum) {
            System.out.println("Игрок " + player + " угадал число " + targetNum + " c " +
                    player.getAttempt() + " попытки.");
            player.increaseScore();
            return true;
        }
        System.out.println("Число " + lastNum + (lastNum > targetNum ? " больше" : " меньше") +
                " того, что загадал компьютер");
        return false;
    }

    private static void checkEndAttempts(Player player) {
        if (player.getAttempt() == Player.NUM_ATTEMPTS) {
            System.out.println("У " + player + " закончились попытки");
        }
    }

    private static void printPlayerAttempts(Player player) {
        System.out.print(player + ": ");
        for (int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void outputInfoWinner() {
        int maxScore = 0;
        int index = 0;
        for (int i = 0; i < NUM_PLAYERS; i++) {
            int score = players[i].getScore();
            if (maxScore < score) {
                maxScore = score;
                index = i;
            }
        }
        System.out.print(maxScore != 1 ? "Победитель: " + players[index] : "Победителей нет");
        nullifyWins();
    }

    private void nullifyWins() {
        for (Player player : players) {
            player.nullifyScore();
        }
    }
}