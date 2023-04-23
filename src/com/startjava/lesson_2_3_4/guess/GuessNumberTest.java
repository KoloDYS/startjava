package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber(createPlayers(scanner));
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.guessNumber();
                System.out.println("\nХотите продолжить игру? [yes/no]:");
            } else {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
            }
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
        scanner.close();
    }

    public static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[GuessNumber.NUM_PLAYERS];
        for (int i = 0; i < GuessNumber.NUM_PLAYERS; i++) {
            System.out.print("Введите имя игрока: ");
            players[i] = new Player(scanner.nextLine());
        }
        return players;
    }
}