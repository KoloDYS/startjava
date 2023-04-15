package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static final Player[] players = new Player[3];

    public GuessNumber(Player... player) {
        System.arraycopy(player, 0, players, 0, player.length);
    }

    public void guessNumber() {
        Random random = new Random();
        int targetNum = random.nextInt(1, 101);
        tossPlayers();
        System.out.println("Игра “Угадай число”");
        System.out.println("У каждого игрока по 3 попытки");
        while (true) {
            if (tryGuess(players[0], targetNum) || tryGuess(players[1], targetNum) ||
                    tryGuess(players[2], targetNum)) {
                break;
            }

            if (players[0].getAttempt() == 3 && players[1].getAttempt() == 3 &&
                    players[2].getAttempt() == 3) {
                System.out.println("Попытки закончились у всех игроков.");
                break;
            }
        }
        System.out.println("Конец игры!");
        System.out.println("Числа игроков: ");
        printPlayerAttempts(players[0]);
        players[0].clear();

        printPlayerAttempts(players[1]);
        players[1].clear();

        printPlayerAttempts(players[2]);
        players[2].clear();
    }

    private static void tossPlayers() {
        for (int i = 0; i < players.length; i++) {
            int j = (int) (Math.random() * 3);
            Player temp = players[i];
            players[i] = players[j];
            players[j] = temp;
        }
    }

    private static boolean tryGuess(Player player, int targetNum) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ход игрока " + player + "\nВведите число от 1 до 100");
        while (!player.addNum(scan.nextInt())) {
            System.out.println("Введите допустимое число");
        }
        if (isGuessed(player, targetNum)) {
            return true;
        }
        checkEndAttempts(player);
        return false;
    }

    private static boolean isGuessed(Player player, int targetNum) {
        int lastNum = player.getNum();
        if (lastNum == targetNum) {
            System.out.println("Игрок " + player + " угадал число " + targetNum + " c " +
                    player.getAttempt() + " попытки.");
            return true;
        } else {
            System.out.println("Число " + lastNum + (lastNum > targetNum ? " больше" : " меньше") +
                    " того, что загадал компьютер");
        }
        return false;
    }

    private static void checkEndAttempts(Player player) {
        if (player.getAttempt() == 3) {
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
}