package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void setExpression(String expression) {
        String[] charsOfExpression = expression.split(" ");
        a = Integer.parseInt(charsOfExpression[0]);
        sign = charsOfExpression[1].charAt(0);
        b = Integer.parseInt(charsOfExpression[2]);
    }

    public double calculate() {
        double result = Double.MIN_VALUE;
        switch (sign) {
            case '+' -> result = Math.addExact(a, b);
            case '-' -> result = Math.subtractExact(a, b);
            case '*' -> result = Math.multiplyExact(a, b);
            case '/' -> result = (double) a / (double) b;
            case '%' -> result = (double) a % (double) b;
            case '^' -> result = Math.pow(a, b);
            default -> System.out.println("Знак математической операции некорректен. Повторите ввод");
        }
        return result;
    }
}