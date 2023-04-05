package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
            player1.setNum(scan.nextInt());
            if (player1.getNum() == num) {
                System.out.println("Игрок " + player1 + " угадал число " + num + " c " +
                        player1.getIndex() + " попытки." );
                break;
            }
            if (player1.getNum() > num) {
                System.out.println("Число " + player1.getNum() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player1.getNum() + " меньше того, что загадал компьютер");
            }
            if (player1.getIndex() == 10) {
                System.out.println("У " + player1 + " закончились попытки");
            }

            System.out.println("Ход переходит к игроку " + player2);
            System.out.println("Введите число от 1 до 100");
            player2.setNum(scan.nextInt());
            if (player2.getNum() == num) {
                System.out.println("Игрок " + player2 + " угадал число " + num + " c " +
                        player2.getIndex() + " попытки." );
                break;
            }
            if (player2.getNum() > num) {
                System.out.println("Число " + player2.getNum() +
                        " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + player2.getNum() +
                        " меньше того, что загадал компьютер");
            }
            if (player2.getIndex() == 10) {
                System.out.println("У " + player2 + " закончились попытки");
            }
            if (player2.getIndex() == 10 || player1.getIndex() == 10) {
                System.out.println("Попытки закончились у обоих игроков.");
                break;
            }
        }
        System.out.println("Конец игры!");
        System.out.println("Числа игроков: ");
        System.out.print(player1 + ": ");
        outputAndNullArray(player1.getArray(), player1.getIndex());
        System.out.print(player2 + ": ");
        outputAndNullArray(player2.getArray(), player2.getIndex());
        player1.nullIndex();
        player2.nullIndex();
    }
    private static void outputAndNullArray(int[] array, int index) {
        int[] copyArray = Arrays.copyOf(array,index);
        for (int num : copyArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.fill(array, 0, index, 0);
    }
}
