package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte tdp = 45;
        short numThread = 12;
        int ram = 16;
        long cpuModel = 5600;
        float clock = 3.3f;
        double maxClock = 4.2;
        char numCore = '6';
        boolean isWork = true;

        System.out.println("Тепловыделение процессора: " + tdp);
        System.out.println("Количество потоков процессора: " + numThread);
        System.out.println("Количество оперативной памяти: " + ram);
        System.out.println("Модель процессора: " + cpuModel);
        System.out.println("Частота процессора: " + clock);
        System.out.println("Максимальная частота процессора: " + maxClock);
        System.out.println("Количество ядер: " + numCore);
        System.out.println("Работа процессора: " + isWork);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        int sumGoods = penPrice + bookPrice;
        int discount = sumGoods / 100 * 11;
        int discountPrice = sumGoods - discount;
        System.out.println("Стоимость товаров без скидки: " + sumGoods);
        System.out.println("Сумма скидки: " + discount);
        System.out.println("Стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a       \n   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    \n JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Первоначальное значение переменной типа byte: " + maxByte);
        maxByte++;
        System.out.println("Значение после инкремента: " + maxByte);
        maxByte--;
        System.out.println("Значение после декремента: " + maxByte);
        System.out.println("Первоначальное значение переменной типа short: " + maxShort);
        maxShort++;
        System.out.println("Значение после инкремента: " + maxShort);
        maxShort--;
        System.out.println("Значение после декремента: " + maxShort);
        System.out.println("Первоначальное значение переменной типа int: " + maxInt);
        maxInt++;
        System.out.println("Значение после инкремента: " + maxInt);
        maxInt--;
        System.out.println("Значение после декремента: " + maxInt);
        System.out.println("Первоначальное значение переменной типа long: " + maxLong);
        maxLong++;
        System.out.println("Значение после инкремента: " + maxLong);
        maxLong--; 
        System.out.println("Значение после декремента: " + maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 5;
        int b = 2;
        int temp = a;
        System.out.println("Перестановка значений переменных с помощью третьей переменной:");
        System.out.println("Исходное значение первой переменной: " + a);
        System.out.println("Исходное значение второй переменной: " + b);
        a = b;
        b = temp;
        System.out.println("Значение первой переменной после перестановки: " + a);
        System.out.println("Значение второй переменной после перестановки: " + b);

        System.out.println("Перестановка значений переменных с помощью арифметических операций:");
        System.out.println("Исходное значение первой переменной: " + b);
        System.out.println("Исходное значение второй переменной: " + a);
        b += a;
        a = b - a;
        b -= a;
        System.out.println("Значение первой переменной после перестановки: " + b);
        System.out.println("Значение второй переменной после перестановки: " + a);

        System.out.println("Перестановка значений переменных с помощью побитовой операции:");
        System.out.println("Исходное значение первой переменной: " + a);
        System.out.println("Исходное значение второй переменной: " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Значение первой переменной после перестановки: " + a);
        System.out.println("Значение второй переменной после перестановки: " + b);

        System.out.println("\n6. Вывод символов и их кодов");
        char sharp = '#';
        char logicAnd = '&';
        char rate = '@';
        char circumFlex = '^';
        char underscore = '_';
        System.out.println((int) sharp + " " + sharp);
        System.out.println((int) logicAnd + " " + logicAnd);
        System.out.println((int) rate + " " + rate);
        System.out.println((int) circumFlex + " " + circumFlex);
        System.out.println((int) underscore + " " + underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char lBracket = '(';
        char rBracket = ')';
        System.out.println("    " + slash + backslash + "\n" +
                "   " + slash + "  " + backslash + "\n" +
                "  " + slash + underscore + lBracket + " " + rBracket + backslash + "\n" +
                " " + slash + "      " + backslash + "\n" +
                "" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int hundreads = num / 100;
        int tens = num % 100 / 10;
        int ones = num % 10;

        System.out.println("Число " + num + " содержит:");
        System.out.println("    " + hundreads + " сотен");
        System.out.println("    " + tens + " десятков");
        System.out.println("    " + ones + " единиц");
        System.out.println("Сумма цифр = " + (hundreads + tens + ones));
        System.out.println("Произведение цифр = " + hundreads * tens * ones);

        System.out.println("\n9. Вывод времени");
        int seconds = 86399;
        int minutes = seconds / 60;
        seconds %= 60;
        int hours = minutes / 60;
        minutes %= 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
