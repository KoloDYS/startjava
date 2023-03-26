package com.startjava.lesson_1;

import java.util.Scanner;

class CalculatorTest {
    // public static void main(String[] args) {
    //     Calculator calculator = new Calculator();
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Начало математических вычислений");
    //     do {
    //         boolean isContinue = true;
    //         System.out.print("\nВведите первое число: ");
    //         calculator.setA(scanner.nextInt());
    //         System.out.print("\nВведите знак математической операции: ");
    //         calculator.setSign((char) scanner.next());
    //         System.out.print("\nВведите второе число: ");
    //         calculator.setB(scanner.nextInt());
    //         System.out.println("Результат вычислений:");
    //         calculator.calculate(calculator.getA(), calculator.getB(), calculator.getSign());
    //         System.out.println("Хотите продолжить вычисления? [yes/no]:");
    //         do {
    //             boolean isNext;
    //             if (scanner.nextLine().equals("no")) {
    //                 isContinue = false;
    //                 isNext = false;
    //             } else if (scanner.nextLine().equals("yes")) {
    //                 isNext = false;
    //             } else {
    //                 System.out.println("Вы ввели недопустимый ответ, введите корректный ответ: ");
    //                 isNext = true;
    //             };
    //         } while (isNext);
    //     } while (isContinue);
    // }
}


public class Calculator {
    public static void main(String[] args) {
        
    }
    // private int a;
    // private int b;
    // private int result = 0;
    // private char sign = '^';

    // public void calculate(int a, int b, char sign){
    //     switch (sign) {
    //         case '+':
    //             result = a + b;
    //             break;
    //         case '-':
    //             result = a - b;
    //             break;
    //         case '*':
    //             result = a * b;
    //             break;
    //         case '/':
    //             result = a / b;
    //             break;
    //         case '%':
    //             result = a % b;
    //             break;
    //         case '^':
    //             result = a;
    //             for (int i = 1; i < b; i++) {
    //                 result *= a;
    //             }
    //             break;
    //         }
    //     System.out.println(a + " " + sign + " " + b + " = " + result);
    // }

    // public int getA() {
    //     return a;
    // }

    // public void setA(int a) {
    //     this.a = a;
    // }

    // public int getB() {
    //     return b;
    // }

    // public void setB(int b) {
    //     this.b = b;
    // }

    // public char getSign() {
    //     return sign;
    // }

    // public char setSign(char sign) {
    //     this.sign = sign;
    // }
}
