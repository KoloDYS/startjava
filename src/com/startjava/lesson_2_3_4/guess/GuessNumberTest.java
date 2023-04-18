package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    static String answer = "yes";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(scanner));
        do {
            if (answer.equals("yes")) {
                game.guessNumber();
                System.out.println("Хотите продолжить игру? [yes/no]:");
            } else {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
            }
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
        scanner.close();
    }

    public static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя игрока: ");
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }
        return players;
    }
}