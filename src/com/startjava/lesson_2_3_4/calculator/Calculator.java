package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int a;
    private static int b;
    private static char sign;

    public static double calculate(String expression) {
        parseExpression(expression);
        return switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> (double) a / (double) b;
            case '%' -> (double) a % (double) b;
            case '^' -> Math.pow(a, b);
            default -> throw new RuntimeException("Знак математической операции некорректен. Повторите ввод");
        };
    }

    private static void parseExpression(String expression) {
        String[] elements = expression.split(" ");
        a = Integer.parseInt(elements[0]);
        sign = elements[1].charAt(0);
        b = Integer.parseInt(elements[2]);
        compareElements(a,b);
    }

    private static void compareElements(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new RuntimeException("Введите подходящие числа");
        }
    }
}