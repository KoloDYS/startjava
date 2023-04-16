package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private final Player[] players;

    private final Player[] winners = new Player[3];

    public GuessNumber(Player... player) {
        players = player;
    }

    private static int index = 0;

    public void guessNumber() {
        Random random = new Random();
        System.out.println("Игра “Угадай число”");
        System.out.println("У каждого игрока по 10 попытки. Победитель выявляется по результатам 3 раундов.");
        shufflePlayers();
        for (int i = 1; i < 4; i++) {
            System.out.println("Раунд №" + i);
            final int targetNum = random.nextInt(1, 101);
            while (true) {
                if (tryGuess(targetNum)) {
                    break;
                }

                if (isEndGame()) {
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
        index = 0;
    }

    private void shufflePlayers() {
        for (int i = 0; i < players.length; i++) {
            int j = (int) (Math.random() * 3);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private boolean tryGuess(int targetNum) {
        Scanner scan = new Scanner(System.in);
        for (Player player : players) {
            System.out.println("Ход игрока " + player + "\nВведите число от 1 до 100");
            while (!player.addNum(scan.nextInt())) {
                System.out.println("Введите допустимое число");
            }
            if (isGuessed(player, targetNum)) {
                return true;
            }
            checkEndAttempts(player);
        }
        return false;
    }

    private boolean isGuessed(Player player, int targetNum) {
        int lastNum = player.getNum();
        if (lastNum == targetNum) {
            System.out.println("Игрок " + player + " угадал число " + targetNum + " c " +
                    player.getAttempt() + " попытки.");
            winners[index++] = player;
            return true;
        } else {
            System.out.println("Число " + lastNum + (lastNum > targetNum ? " больше" : " меньше") +
                    " того, что загадал компьютер");
        }
        return false;
    }

    private static void checkEndAttempts(Player player) {
        if (player.getAttempt() == 10) {
            System.out.println("У " + player + " закончились попытки");
        }
    }

    private boolean isEndGame() {
        boolean isEnd = true;
        for (Player player : players) {
            isEnd = player.getAttempt() == 10;
        }
        return isEnd;
    }

    private static void printPlayerAttempts(Player player) {
        System.out.print(player + ": ");
        for (int num : player.getNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private void outputInfoWinner() {
        Player winner = null;
        for (int i = 0; i < winners.length; i++) {
            for (int j = i + 1; j < winners.length; j++) {
                if (winners[i] == winners[j]) {
                    winner = winners[i];
                    break;
                }
            }
        }
        System.out.println(winner != null ? "Победитель : " + winner : "Победителя нет");
    }
}