public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int k = -10;
        int evenNum = 0;
        int oddNum = 0;
        do {
            if (k % 2 == 0) {
                evenNum += k;
            } else {
                oddNum +=k;
            }
            k++;
        } while (k <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenNum + 
                ", а нечетных = " + oddNum); 

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int min = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 > num3) {
                min = num3;
            } else {
                min = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
            if (num1 > num3) {
                min = num3;
            } else {
                min = num1;
            }
        } else {
            max = num3;
            if (num1 > num2) {
                min = num2;
            } else {
                min = num1;
            }
        }
        for (int i = --max; i > min; i--) {
        System.out.print(i + " ");
        }

        System.out.println("\n3.Вывод реверсивного числа и суммы его цифр");
        int digit =0;
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
            System.out.println(digit);
        }
        System.out.println("Сумма цифр: " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int rightNum = 24;
        for(int i = 1; i < rightNum; i += 2) {
            if (count % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%4d",i);
            count++;
            if (i > rightNum - 2 && count % 5 != 0) {
                count %= 5;
                for (int j = 0; j < 5 -count; j++) {
                    System.out.printf("%4d", 0);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int chislo = 3242592;
        int dvoiki = 0;
        System.out.print("Число " + chislo);
        while (chislo % 10 != 0) {
            if (chislo % 10 == 2) {
                dvoiki++;
            }
            chislo = chislo / 10;
        }
        if (dvoiki % 2 == 0) {
            System.out.print(" содержит " + dvoiki + " (четное) количество двоек");
        } else {
            System.out.print(" содержит " + dvoiki + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j =0; j < 10; j++) {
                System.out.print("*");
            }
        }
        System.out.println();

        int lines = 5;
        int temp = 5;
        while (lines > 0) {
            System.out.println();
            while (temp > 0) {
                System.out.print("#");
                temp --;
        }
            lines--;
            temp = lines;
        }
        System.out.println();
//  //triangle
//         lines = 0;
//         int number$ = 0;
//         do {
//             System.out.println();
//             do {
//                 if (3 - lines > 0) {
//                     System.out.print("$");
//                 number$ = lines;
//                 } else {
//                     System.out.println("$");
//                     number$--;
//                 }
//                 number$++;
//             } while ( >= number$+lines);
//             lines++;
//         } while (lines < 5);
//         System.out.println();
// //end triangle
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i = 0; i < 48 ; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d %4c %n", i, (char) i);
            }
        }
        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d %4c %n", i, (char) i);}
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int pal = 1234321;
        boolean isRight = true;
        int tenDegree = 0;
        int divider = 10;
        for (int i = 1; i < 4; i++) {
            tenDegree = 8 - (i + 1) - (i - 1);
            for (int j = 1; j < tenDegree; j++) {
                divider *= 10;
            }
            int lDigit = pal / divider;
            pal = pal - (divider * lDigit);
            int rDigit = pal % 10;
            pal /= 10;
            if (lDigit != rDigit) {
                isRight = false;
            }
            divider = 10;
            tenDegree = 0;
        }
        System.out.println("Число является палиндромом: " + isRight);

        System.out.println("\n9. Определение, является ли число счастливым");
        chislo = 567918;
        sum = 0;
        int sum1 = 0;
        for (int i = 0; i < 2; i++) {
            sum1 = sum;
            sum = 0;
            System.out.print("Сумма цифр ");
            for (int j = 0; j < 3; j++) {
                digit = chislo % 10;
                chislo = chislo / 10;
                sum = sum + digit;
                System.out.print(digit);
            }
            System.out.print(" = " + sum + "\n");
            if (i == 1) {
                if (sum1 == sum) {
                    System.out.println("Число является счастливым");
                } else {
                    System.out.println("Число несчастливое");
                }
            }
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