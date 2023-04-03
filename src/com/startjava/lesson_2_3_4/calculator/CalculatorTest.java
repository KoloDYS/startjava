package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало математических вычислений");
        do {
            if (answer.equals("yes")) {
                System.out.print("\nВведите математическое выражение: ");
                double res = calculator.calculate(scanner.nextLine());
                System.out.println("\nРезультат вычислений: " + (res % 1 == 0 ? (int) res + "" : res));
                System.out.print("Хотите продолжить вычисления? [yes/no]:\n");
            } else {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
            }
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
        scanner.close();
    }
}