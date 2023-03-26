package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNumbers + 
                ", а нечетных = " + sumOddNumbers); 

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num2;

        if (num2 > num1) {
            min = num1;
            max = num2;
        }
        if (min > num3) {
            min = num3;
        } else if (num3 > max) {
            max = num3;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int endRange = 24;
        for(int i = 1; i < endRange; i += 2) {
            if (count % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%4d",i);
            count++;
            if (i > endRange - 2 && count % 5 != 0) {
                count %= 5;
            }
        }
        for (int i = 0; i < 5 - count; i++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int countTwos = 0;
        System.out.print("Число " + num);
        while (num > 0) {
            if (num % 10 == 2) {
                countTwos++;
            }
            num /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.print(" содержит " + countTwos + " (четное) количество двоек");
        } else {
            System.out.print(" содержит " + countTwos + " (нечетное) количество двоек");
        }

        System.out.println("\n\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
        }
        System.out.println();

        int lines = 5;
        int numSymbols = 5;
        while (lines > 0) {
            System.out.println();
            while (numSymbols > 0) {
                System.out.print("#");
                numSymbols--;
            }
            numSymbols = --lines;
        }
        System.out.println();
        //triangle

        lines = 0;
        do {
            lines++;
            System.out.println();
            if (lines < 4) {
                numSymbols = lines;
            } else {
                numSymbols = 6 - lines;
            }
            do {
                System.out.print("$");
            } while (--numSymbols > 0);
        } while (lines < 5);
        
        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        //odd-number symbols
        for (int i = 1; i < 48; i += 2) {
            System.out.printf("%3d %4c %n", i, (char) i);
        }
        //even-number symbols
        for (int i = 98; i < 123; i+= 2) {
            System.out.printf("%3d %4c %n", i, (char) i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int palindrome = 1234321;
        int palindromeCopy = palindrome;
        int reverseNum = 0;
        while (palindrome > 0) {
            reverseNum = (reverseNum * 10) + palindrome % 10;
            palindrome /= 10;
        }

        if (palindromeCopy == reverseNum) {
            System.out.println("Число является палиндромом");
        } else {
            System.out.println("Число не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num = 567918;
        int rightHalfNum = num % 1000;
        int leftHalfNum = num / 1000;
        int sumRightHalf = 0;
        int sumLeftHalf = 0;
        sum = 0;
        int sum1 = 0;
        System.out.print("Сумма цифр: ");
        for (int i = 0; i < 3; i++) {
            //right side
            int digit = rightHalfNum % 10;
            rightHalfNum /= 10;
            sum += digit;
            //left side
            digit = leftHalfNum % 10;
            leftHalfNum /= 10;
            sum1 += digit;
        }
        System.out.println("Сумма цифр: " + num % 1000 + " = " + sum);
        System.out.println("Сумма цифр: " + num / 1000 + " = " + sum1);
        if (sum == sum1) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число несчастливое");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.printf("%25s","Таблица Пифагора\n");
        for (int i = 1; i < 10; i++) {
            if (i == 2) {
                for (int j = 0; j < 28; j++) {
                    System.out.print("_");
                }
                System.out.println();
            }
            for (int j = 1; j < 10; j++) {
                if (j == 1) {
                    if (i == 1) {
                        System.out.printf("%4s", "|");
                    } else {
                        System.out.printf("%d %2s",j * i, "|");
                    }
                } else {
                    System.out.printf("%3d", j * i);
                }
            }
            System.out.println();
        }
    }
}