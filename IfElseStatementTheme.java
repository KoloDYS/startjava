public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 19;
        double height = 1.86;
        boolean maleSex = true;

        if (age > 20) {
            System.out.println("Вы меняли паспорт");
        } else {
            System.out.println("Вам еще предстоит получить или заменить паспорт");
        }

        if (!maleSex) {
            System.out.println("Вам нельзя в мужскую уборную");
        } else {
            System.out.println("Вам нельзя в женскую уборную");
        }

        if (height < 1.80) {
            System.out.println("Вы ниже Брэд Питта");
        } else {
            System.out.println("Вы выше или такого же роста, как и Брэд Питт");
        }

        char capprogrammingalLetter = "Sergei".charAt(0);
        if (capprogrammingalLetter == 'M') {
            System.out.println("Возможно ваше имя Max");
        } else if (capprogrammingalLetter == 'I') {
            System.out.println("Возможно ваше имя Igor");
        } else {
            System.out.println("Ваше имя начинается с другой буквы");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 2605;
        int num2 = 2705;
        System.out.println("Числа для сравнения: " + num1 + " и " + num2);
        if(num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else if (num1 == num2) {
            System.out.println("Число " + num1 + " равно " + "числу " + num2);
        } else {
            System.out.println("Число " + num2 + " больше числа " + num1);
        }

        System.out.println("\n3. Проверка числа");
        int num3 = 53;
        if (num3 == 0) {
            System.out.println("Число равно 0");
        } else {
            if (num3%2 == 0){
                System.out.print("Число " + num3 + " четное и ");
            } else {
                System.out.print("Число " + num3 + " нечетное и ");
            }
            if (num3 > 0) {
                System.out.print("положительное\n");
            } else {
                System.out.print("отрицательное\n");
            }
        }


        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 753;
        int num5 = 942;
        int hundreads4 = num4 / 100;
        int hundreads5 = num5 / 100;
        int tens4 = num4 % 100 / 10;
        int tens5 = num5 % 100 / 10;
        int ones4 = num4 % 10;
        int ones5 = num5 % 10;

        System.out.println("Исходные числа: " + num4 + " и " + num5);
        if (hundreads4 != hundreads5 && tens4 != tens5 && ones4 != ones5) {
            System.out.println("Равных цифр в разрядах чисел " + num4 + " и " + num5 + " нет");
        } else {
            System.out.print("У чисел " + num4 + " и " + num5);
            if (hundreads4 == hundreads5) {
                System.out.print(" на разряде сотен одинаковая цифра: " + hundreads4 + ",");
            } if (tens4 == tens5) {
                System.out.print(" на разряде десятков одинаковая цифра: " + tens4 + ",");
            } if (ones4 == ones5) {
                System.out.print(" на разряде единиц одинаковая цифра: " + ones4);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (47 < symbol && symbol < 58) {
            System.out.println("Символ " + symbol + " является числом");
        } else if (96 < symbol && symbol < 123) {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (64 < symbol && symbol < 91) {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int sum = 300_000;
        int finalSum;
        int percent;
        if (sum < 100_000) {
            percent = 5;
        } else if (sum > 100_000 && sum < 300_000) {
            percent = 7;
        } else {
            percent = 10;
        }
        finalSum = sum / 100 * percent + sum;
        System.out.println("Сумма вклада = " + sum);
        System.out.println("Начисленный процент = " + (finalSum - sum));
        System.out.println("Итоговая сумма = " + finalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int gradeHistory = 5;
        int gradeProgramming = 5;

        if (history <= 60) {
            gradeHistory = 2;
        } else if (history > 60 && history <= 73) {
            gradeHistory = 3;
        } else if (history > 73 && history <= 91) {
            gradeHistory = 4;
        }
        if (programming <= 60) {
            gradeProgramming = 2;
        } else if (programming > 60 && programming <= 73) {
            gradeProgramming = 3;
        } else if (programming > 73 && programming <= 91) {
            gradeProgramming = 4;
        }

        System.out.println("Оценка за предмет: " + gradeHistory + " история");
        System.out.println("Оценка за предмет: " + gradeProgramming + " программирование");
        System.out.println("Средний балл по оценкам: " + (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний % по предметам: " + (history + programming) / 2 + "%");

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int averageSale = 13000;
        int costProduct = 9000;
        int profprogramming = (averageSale - rent - costProduct) * 12;
        if (profprogramming > 0) {
            System.out.println("Прибыль за год: +" + profprogramming);
        } else {
            System.out.println("Прибыль за год: " + profprogramming);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int usdSum = 567;
        int hundreads = usdSum / 100;
        int tens = usdSum % 100 / 10;
        int ones = usdSum % 10;
        int hundread = 10;
        int ten = 5;
        int one = 50;
        int remaindH;
        int remaindO;
        int remaindT;
        boolean isHave = true;

        if (hundreads > hundread) {
            hundreads -= hundread;
            tens = tens + hundreads * 10;
            if (tens > ten) {
                tens -= ten;
                ones = tens * 10 + ones;
                if (ones > one){
                    System.out.println("Не хватает банкнот для выдачи необходимой суммы");
                    isHave = false;
                } else {
                    remaindO = one - ones;
                    one -= remaindO;
                }
            } else {
                remaindT = ten - tens;
                ten -= remaindT;
                if (ones > one) {
                    System.out.println("Не хватает банкнот для выдачи необходимой суммы");
                    isHave = false;
                } else {
                    remaindO = one - ones;
                    one -= remaindO;
                }
            }

        } else {
            remaindH = hundread - hundreads;
            hundread -= remaindH;
            if (tens > ten) {
                tens -= ten;
                ones = tens * 10 + ones;
                if (ones > one) {
                    System.out.println("Не хватает банкнот для выдачи необходимой суммы");
                    isHave = false;
                } else {
                    remaindO = one - ones;
                    one -= remaindO;
                }
            } else {
                remaindT = ten - tens;
                ten -= remaindT;
                if (ones > one) {
                    System.out.println("Не хватает банкнот для выдачи необходимой суммы");
                    isHave = false;
                } else {
                    remaindO = one - ones;
                    one -= remaindO;
                }
            }
        }
        if (isHave) {
            System.out.println("Для требуемой суммы: " + usdSum + 
                    " требуется количество банкнот номиналом 100: " + hundread + 
                    "; номиналом 10: " + ten + "; номиналом 1: " + one);
        }
    }
}