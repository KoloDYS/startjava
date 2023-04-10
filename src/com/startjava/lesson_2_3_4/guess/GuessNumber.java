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
        int num = random.nextInt(1, 101);
        Scanner scan = new Scanner(System.in);
        System.out.println("Игра “Угадай число”");
        while (true) {
            System.out.println("Ход игрока " + player1);
            System.out.println("Введите число от 1 до 100");
            player1.addNum(scan.nextInt());
            if (isGuess(player1, num)) {
                break;
            }
            isEndAttempts(player1);

            System.out.println("Ход переходит к игроку " + player2);
            System.out.println("Введите число от 1 до 100");
            player2.addNum(scan.nextInt());
            if (isGuess(player2, num)) {
                break;
            }
            isEndAttempts(player2);

            if (player2.getplayerAttempts() == 10 && player1.getplayerAttempts() == 10) {
                System.out.println("Попытки закончились у обоих игроков.");
                break;
            }
        }
        System.out.println("Конец игры!");
        System.out.println("Числа игроков: ");
        System.out.print(player1 + ": ");
        player1.outputAndNullArray();
        player1.nullplayerAttempts();
        System.out.print(player2 + ": ");
        player2.outputAndNullArray();
        player2.nullplayerAttempts();
    }

    private static void isEndAttempts(Player player) {
        if (player.getplayerAttempts() == 10) {
            System.out.println("У " + player + " закончились попытки");
        }
    }
    private static boolean isGuess(Player player, int num) {
        if (player.getNum() == num) {
            System.out.println("Игрок " + player + " угадал число " + num + " c " +
                    player.getplayerAttempts() + " попытки." );
            return true;
        }
        if (player.getNum() > num) {
            System.out.println("Число " + player.getNum() + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + player.getNum() + " меньше того, что загадал компьютер");
        }
        return false;
    }
}