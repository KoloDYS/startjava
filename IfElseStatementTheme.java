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

        char capitalLetter = "Sergei".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Возможно ваше имя Max");
        } else if (capitalLetter == 'I') {
            System.out.println("Возможно ваше имя Igor");
        } else {
            System.out.println("Ваше имя начинается с другой буквы");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 2605;
        int num2 = 2705;
        System.out.println("Числа для сравнения: " + num1 + " и " + num2);
        if (num1 == num2) {
            System.out.println("Число " + num1 + " равно " + "числу " + num2);
        } else if (num1 > num2) {
            System.out.println("Число " + num1 + " больше числа " + num2);
        } else {
        System.out.println("Число " + num2 + " больше числа " + num1);
        }

        System.out.println("\n3. Проверка числа");
        int num3 = 53;
        if (num3 == 0) {
            System.out.println("Число равно 0");
        } else {
            if (num3 % 2 == 0) {
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
        int num4 = 345;
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
            }
            if (tens4 == tens5) {
                System.out.print(" на разряде десятков одинаковая цифра: " + tens4 );
            }
            if (ones4 == ones5) {
                System.out.print(" на разряде единиц одинаковая цифра: " + ones4);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if ('/' < symbol && symbol < ':') {
            System.out.println("Символ " + symbol + " является числом");
        } else if ('`' < symbol && symbol < '{') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if ('@' < symbol && symbol < '[') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int sum = 300_000;
        int percent = 5;
        if (sum > 100_000 && sum < 300_000) {
            percent = 7;
        } else {
            percent = 10;
        }
        int finalSum = sum / 100 * percent + sum;
        System.out.println("Сумма вклада = " + sum);
        System.out.println("Начисленный процент = " + (finalSum - sum));
        System.out.println("Итоговая сумма = " + finalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int scoreHistory = 59;
        int scoreProgramming = 91;
        int gradeHistory = 5;
        int gradeProgramming = 5;

        if (scoreHistory <= 60) {
            gradeHistory = 2;
        } else if (scoreHistory > 60 && scoreHistory <= 73) {
            gradeHistory = 3;
        } else if (scoreHistory > 73 && scoreHistory <= 91) {
            gradeHistory = 4;
        }
        if (scoreProgramming <= 60) {
            gradeProgramming = 2;
        } else if (scoreProgramming > 60 && scoreProgramming <= 73) {
            gradeProgramming = 3;
        } else if (scoreProgramming > 73 && scoreProgramming <= 91) {
            gradeProgramming = 4;
        }

        System.out.println("Оценка за предмет: " + gradeHistory + " история");
        System.out.println("Оценка за предмет: " + gradeProgramming + " программирование");
        System.out.println("Средний балл по оценкам: " + (gradeHistory + gradeProgramming) / 2);
        System.out.println("Средний % по предметам: " + (scoreHistory + scoreProgramming) / 2 + "%");

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
        int hundread = 7;
        int ten = 8;
        int one = 13;
        int remaindH;
        int remaindO;
        int remaindT;
        boolean isHave = true;

        if (hundread * 100 + ten * 10 + one < usdSum || ones > one ||
        (hundread > hundreads && ten * 10 + one < tens * 10 + ones)) {
            System.out.println("Не хватает банкнот для выдачи необходимой суммы");
        } else {
            if (hundreads > hundread) {
                hundreads -= hundread;
                tens = tens + hundreads * 10;
                if (tens > ten) {
                    tens -= ten;
                    ones = tens * 10 + ones;
                    remaindO = one - ones;
                    one -= remaindO;
                } else {
                    remaindT = ten - tens;
                    ten -= remaindT;
                    remaindO = one - ones;
                    one -= remaindO;
                }
            } else {
                remaindH = hundread - hundreads;
                hundread -= remaindH;
                if (tens > ten) {
                    tens -= ten;
                    ones = tens * 10 + ones;
                    remaindO = one - ones;
                    one -= remaindO;
                } else {
                    remaindT = ten - tens;
                    ten -= remaindT;
                    remaindO = one - ones;
                    one -= remaindO;
                }
            }
            System.out.println("Для требуемой суммы: " + usdSum + 
                    " требуется количество банкнот номиналом 100: " + hundread + 
                    "; номиналом 10: " + ten + "; номиналом 1: " + one);
        }
    }
}