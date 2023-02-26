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

        char firstLetterOfName = "Sergei".charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Возможно ваше имя Max");
        } else if (firstLetterOfName == 'I') {
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
                if (num3 > 0) {
                    System.out.println("Число " + num3 + " четное и положительное");
                } else {
                    System.out.println("Число " + num3 + " четное и отрицательное");
                }
        } else {
            if (num3 > 0) {
                System.out.println("Число " + num3 + " нечетное и положительное");
            } else {
                System.out.println("Число " + num3 + " нечетное и отрицательное");
                }
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 123;
        int num5 = 223;
        int h4 = num4 / 100;
        int h5 = num5 / 100;
        int t4 = num4 % 100 / 10;
        int t5 = num5 % 100 / 10;
        int o4 = num4 % 10;
        int o5 = num5 % 10;
        System.out.println("Исходные числа: " + num4 + " и " + num5);
        if (h4 != h5 && t4 != t5 && o4 != o5) {
            System.out.println("Равных цифр в разрядах чисел " + num4 + " и " + num5 + " нет");
        } else {
            if (h4 == h5) {
                if (t4 == t5) {
                    if (o4 == o5) {
                        System.out.println("У чисел равные цифры " + h4 + ", " + t4 + ", " + o4 + " на всех разрядах");
                    } if(o4 != o5){
                        System.out.println("У чисел равные цифры на разряде сотен и десятков, соответственно: " + h4 + " и " + t4);
                    }
            } if (o4 != o5 && t4 != t5){
                System.out.println("У чисел равная цифра на разряде сотен: " + h4);
            } else if (o4 == o5 && t4 != t5) {
                System.out.println("У чисел равные цифры на разряде сотен и единиц, соответственно: " + h4 + " и " + o4);
            }
        } else if (t4 == t5) {
            if (o4 == o5) {
                System.out.println("У чисел равные цифры на разряде десятков и единиц, соответственно: " + t4 + " и " + o4);
            } if (o4 != o5){
                System.out.println("У чисел равная цифра на разряде десятков: " + t4);
            }
        } else {
            if(h4 == h5){
                System.out.println("У чисел равная цифра на разряде сотен и единиц, соответственно: " + h4 + " и " + o4);
            }
            System.out.println("У чисел равная цифра на разряде единиц: " + o4);
        }
}

        System.out.println("\n5. Определение символа по его коду");
        char symb = '\u0057';
        if ('/' < symb && symb < ':') {
            System.out.println("Символ " + symb + " является числом");
        } else if ('`' < symb && symb < '{') {
            System.out.println("Символ " + symb + " является маленькой буквой");
        } else if ('@' < symb && symb < '[') {
            System.out.println("Символ " + symb + " является большой буквой");
        } else {
            System.out.println("Символ " + symb + " не буква и не число");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int sum = 300_000;
        int finalSum;
        if (sum < 100_000) {
            finalSum = sum / 100 * 5 + sum;
        } else if (sum > 100_000 && sum < 300_000) {
            finalSum = sum / 100 * 7 + sum;
        } else {
            finalSum = sum / 10 + sum;
        }
        System.out.println("Сумма вклада = " + sum);
        System.out.println("Начисленный процент = " + (finalSum - sum));
        System.out.println("Итоговая сумма = " + finalSum);

        System.out.println("\n7. Определение оценки по предметам");
        int history = 59;
        int it = 91;
        int grade1, grade2;
        if (history <= 60) {
            grade1 = 2;
        } else if (history > 60 && history <= 73) {
            grade1 = 3;
        } else if (history > 73 && history <= 91) {
            grade1 = 4;
        } else {
            grade1 = 5;
        }
        if (it <= 60) {
            grade2 = 2;
        } else if (it > 60 && it <= 73) {
            grade2 = 3;
        } else if (it > 73 && it <= 91) {
            grade2 = 4;
        } else {
            grade2 = 5;
        }
        System.out.println("Оценка за предмет: " + grade1 + " история");
        System.out.println("Оценка за предмет: " + grade2 + " программирование");
        System.out.println("Средний балл по оценкам: " + (grade1 + grade2) / 2);
        System.out.println("Средний % по предметам: " + (history + it) / 2 + "%");

        System.out.println("\n8. Расчет прибыли за год");
        int rent = 5000;
        int averageSale = 13000;
        int costProduct = 9000;
        int profit = (averageSale - rent - costProduct) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }

        System.out.println("\n9. Подсчет количества банкнот");
        int usdSum = 567;
        int h = usdSum / 100;
        int t = usdSum % 100 / 10;
        int o = usdSum % 10;
        int hundread = 10;
        int ten = 5;
        int ones = 50;
        int remaindH;
        int remaindO;
        int remaindT;

        if (h > hundread) {
            h = h - hundread;
            t = t + h * 10;
            if (t > ten) {
                t -= ten;
                o = t * 10 + o;
                if (o > ones){
                    System.out.println("Не хватает банкнот для выдачи необходимой суммы");
                } else {
                    remaindO = ones - o;
                    ones -= remaindO;
                    System.out.println("Для требуемой суммы: " + usdSum + 
                        " требуется количество банкнот номиналом 100: " + hundread + 
                        "; номиналом 10: " + ten + "; номиналом 1: " + ones);
                }
            } else {
                remaindT = ten - t;
                ten -= remaindT;
                if (o > ones) {
                    System.out.println("Не хватает банкнот для выдачи необходимой суммы");
                } else {
                    remaindO = ones - o;
                    ones -= remaindO;
                    System.out.println("Для требуемой суммы: " + usdSum + 
                    " требуется количество банкнот номиналом 100: " + hundread + 
                    "; номиналом 10: " + ten + "; номиналом 1: " + ones);
                }
            }
        } else {
            remaindH = hundread - h;
            hundread -= remaindH;
            if (t > ten) {
                t -= ten;
                o = t * 10 + o;
                if (o > ones){
                    System.out.println("Не хватает банкнот для выдачи необходимой суммы");
                } else {
                    remaindO = ones - o;
                    ones -= remaindO;
                    System.out.println("Для требуемой суммы: " + usdSum + 
                            " требуется количество банкнот номиналом 100: " + hundread + 
                            "; номиналом 10: " + ten + "; номиналом 1: " + ones);
                }
            } else {
                remaindT = ten - t;
                ten -= remaindT;
                if (o > ones){
                System.out.println("Не хватает банкнот для выдачи необходимой суммы");
            } else {
                remaindO = ones - o;
                ones -= remaindO;
                System.out.println("Для требуемой суммы: " + usdSum + 
                        " требуется количество банкнот номиналом 100: " + hundread + 
                        "; номиналом 10: " + ten + "; номиналом 1: " + ones);
                }
            }
        }
    }
}