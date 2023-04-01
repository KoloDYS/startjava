package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало математических вычислений");
        do {
            System.out.print("\nВведите математическое выражение: ");
            calculator.setExpression(scanner.nextLine());
            System.out.println("Результат вычислений: ");
            if (calculator.calculate() != Double.MIN_VALUE) {
                System.out.println(calculator.calculate() % 1 == 0 ?
                        (int) calculator.calculate() + "" : calculator.calculate());
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]:\n");
            answer = scanner.nextLine();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
                answer = scanner.nextLine();
            }
        } while (answer.equals("yes"));
        scanner.close();
    }
}