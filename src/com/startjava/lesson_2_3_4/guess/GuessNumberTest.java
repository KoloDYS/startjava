package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя игрока: ");
        Player player2 = new Player(scanner.nextLine());

        System.out.print("Введите имя игрока: ");
        Player player3 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2, player3);
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
}