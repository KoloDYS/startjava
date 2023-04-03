package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    private void setExpression(String expression) {
        String[] elements = expression.split(" ");
        a = Integer.parseInt(elements[0]);
        sign = elements[1].charAt(0);
        b = Integer.parseInt(elements[2]);
    }

    public double calculate(String expression) {
        setExpression(expression);
        return switch (sign) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> (double) a / (double) b;
            case '%' -> (double) a % (double) b;
            case '^' -> Math.pow(a, b);
            default ->  {
                System.out.print("Знак математической операции некорректен. Повторите ввод");
                yield 0;
            }
        };
    }
}