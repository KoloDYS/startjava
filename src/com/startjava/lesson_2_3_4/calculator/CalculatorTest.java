package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer = "yes";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало математических вычислений");
        do {
            if (answer.equals("yes")) {
                System.out.print("\nВведите математическое выражение, содержащее целые положительные числа: ");
                try {
                    double result = Calculator.calculate(scanner.nextLine());
                    System.out.println("\nРезультат вычислений: " +
                            (result % 1 == 0 ? (int) result + "" : result));
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                System.out.print("\nХотите продолжить вычисления? [yes/no]:\n");
            } else {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
            }
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
        scanner.close();
    }
}