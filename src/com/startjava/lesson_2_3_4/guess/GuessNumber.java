package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int lastNum;
    private int targetNum;
    private static final Player[] players = new Player[3];

    public GuessNumber(Player... player) {
        for (int i = 0; i < 3; i++) {
            players[i] = player[i];
        }
    }

    public void guessNumber() {
        Random random = new Random();
        System.out.println("Игра “Угадай число”");
        System.out.println("У каждого игрока по 10 попытки. Победитель выявляется по результатам 3 раундов.");
        shufflePlayers();
        for (int i = 1; i < 4; i++) {
            System.out.println("Раунд №" + i);
            targetNum = random.nextInt(1, 101);
            while (true) {
                if (tryGuess(targetNum)) {
                    break;
                }

                if (players[0].getAttempt() == 10) {
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
        lastNum = player.getNum();
        if (lastNum == targetNum) {
            System.out.println("Игрок " + player + " угадал число " + targetNum + " c " +
                    player.getAttempt() + " попытки.");
            player.increaseWinCounter();
            return true;
        }
        System.out.println("Число " + lastNum + (lastNum > targetNum ? " больше" : " меньше") +
                " того, что загадал компьютер");
        return false;
    }

    private static void checkEndAttempts(Player player) {
        if (player.getAttempt() == 10) {
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
        int index = -1;
        for (int i = 0; i < wins.length; i++) {
            wins[i] = players[i].getWinCounter();
        }
        for (int i = 0; i < wins.length; i++) {
            for (int j = i + 1; j < wins.length; j++) {
                if (wins[i] > wins[j]) {
                    index = i;
                } else if (wins[j] > wins[i]) {
                    index = j;
                }
            }
        }
        System.out.println(index != -1 ? "Победитель: " + players[index] : "Победителей нет");
        nullWins();
    }

    private void nullWins() {
        for (Player player : players) {
            player.nullWinCounter();
        }
    }
}