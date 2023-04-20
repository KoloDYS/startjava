package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

import static com.startjava.lesson_2_3_4.guess.Player.*;

public class GuessNumber {
    private static final int NUM_OF_PLAYERS = 3;
    private static final int NUM_OF_ROUNDS = 3;
    private final Player[] players = new Player[NUM_OF_PLAYERS];

    public GuessNumber(Player... player) {
        for (int i = 0; i < NUM_OF_PLAYERS; i++) {
            players[i] = player[i];
        }
    }

    public void guessNumber() {
        Random random = new Random();
        System.out.println("Игра “Угадай число”");
        System.out.println("У каждого игрока по 10 попытки. Победитель выявляется по результатам 3 раундов.");
        shufflePlayers();
        for (int i = 0; i < NUM_OF_ROUNDS; i++) {
            System.out.println("Раунд №" + (i + 1));
            int targetNum = random.nextInt(LOWER_LIMIT_OF_NUM, UPPER_LIMIT_OF_NUM);
            while (true) {
                if (tryGuess(targetNum)) {
                    break;
                }

                if (players[2].getAttempt() == 10) {
                    System.out.println("Попытки закончились у всех игроков.");
                    break;
                }
            }
            System.out.println("Конец раунда!");
            System.out.println("Числа игроков: ");
            for (int j = 0; j < 3; j++) {
                printPlayerAttempts(players[j]);
                players[j].clear();
            }
        }
        outputInfoWinner();
    }

    private void shufflePlayers() {
        for (int i = 0; i < players.length; i++) {
            int j = (int) (Math.random() * players.length);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private boolean tryGuess(int targetNum) {
        for (Player player : players) {
            System.out.println("Ход игрока " + player + "\nВведите число от 1 до 100");
            inputNum(player);
            if (isGuessed(player, targetNum)) {
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

    private boolean isGuessed(Player player, int targetNum) {
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
        if (player.getAttempt() == NUMBER_OF_ATTEMPTS) {
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
        int[] wins = new int[players.length];
        int index = 0;
        for (int i = 0; i < wins.length; i++) {
            wins[i] = players[i].getScore();
        }
        int maxWins = 0;
        for (int i = 0; i < wins.length; i++) {
            if (wins[i] > maxWins) {
                index = i;
                maxWins = wins[i];
            }
        }
        System.out.println(maxWins != 1 ? "Победитель: " + players[index] : "Победителей нет");
        nullifyWins();
    }

    private void nullifyWins() {
        for (Player player : players) {
            player.nullifyScore();
        }
    }
}