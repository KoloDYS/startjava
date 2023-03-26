package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }


    public void calculate() {
        int result = 0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            default:
                System.out.println("Знак математической операции некорректен. Повторите ввод ");
                break;
        }
        System.out.println("Результат: " + a + " " + sign + " " + b + " = " + result);
    }
}