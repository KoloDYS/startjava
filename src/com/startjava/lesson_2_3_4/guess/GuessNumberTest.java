package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        do {
            game.guessNumber();
            System.out.print("Хотите продолжить игру? [yes/no]:\n");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
                answer = scanner.nextLine();
            }
        } while (answer.equals("yes"));
    }
}