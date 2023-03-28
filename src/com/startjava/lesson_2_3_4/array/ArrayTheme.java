package com.startjava.lesson_2_3_4.array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] nums = {4, 2, 5, 7, 1, 3, 6};
        System.out.print("Массив до модификации: ");
        printElementsOfArray(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.print("\nМассив после модификации: ");
        printElementsOfArray(nums);

        System.out.println("\n\n2.Вывод произведения элементов массива");
        int[] tenDigits = new int[10];
        for (int i = 0; i < tenDigits.length; i++) {
            tenDigits[i] = i;
        }
        int product = 1;
        for (int i = 1; i < tenDigits.length - 1; i++) {
            product *= i;
            System.out.print((i == 8) ? i + " = " + product : i + " * ");
        }
        System.out.println("\nЦифры 0 и 9 находятся в массиве под индексами : " + tenDigits[0] + " и " + tenDigits[9]);

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArr = new double[15];
        int len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        int indexOfMid = len / 2;
        double key = doubleArr[indexOfMid];
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > key) {
                doubleArr[i] = 0;
                counter++;
            }
        }
        for (int i = 0; i < len; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f  ", doubleArr[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек = " + counter);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] chars = new char[26];
        for (int i = 65, j = 0; i < 91; i++, j++) {
            chars[j] = (char) i;
        }
        String alphabet = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            alphabet = alphabet + chars[i];
            System.out.println(alphabet);
        }

        System.out.println("\n5.Генерация уникальных чисел");
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for (int i = 0; i < len; i++) {
            boolean isContains;
            do {
                int numToArray = 60 + (int) (Math.random() * 40);
                isContains = false;
                for (int num : uniqueNums) {
                    if (num == numToArray) {
                        isContains = true;
                    }
                }
                uniqueNums[i] = numToArray;
            } while (isContains);
        }
        Arrays.sort(uniqueNums);
        for (int i = 0; i < len; i++) {
            if (i == 10 || i == 20) {
                System.out.println();
            }
            System.out.print(uniqueNums[i] + " ");
        }

        System.out.println("\n\n6.Копирование не пустых строк");
        String[] stringsAndSpaces = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        counter = 0;
        for (String s : stringsAndSpaces) {
            if (s.isBlank()) {
                counter++;
            }
        }
        String[] strings = new String[stringsAndSpaces.length - counter];
        int startSequence = 0;
        int endSequence = 0;
        int desPos = 0;
        //If two or more spaces
        for (int i = 0; i < stringsAndSpaces.length; i++) {
            if (stringsAndSpaces[i].isBlank()) {
                if (startSequence == 0) {
                    startSequence = i + 1;
                } else {
                    endSequence = i;
                    System.arraycopy(stringsAndSpaces, startSequence, strings, desPos, endSequence - startSequence);
                    desPos += (endSequence - startSequence);
                    startSequence = endSequence + 1;
                }
            }
        }
        //If one space
        if (endSequence == 0) {
            System.arraycopy(stringsAndSpaces, 0, strings, 0, startSequence - 1);
            System.arraycopy(stringsAndSpaces, startSequence, strings, startSequence - 1, (strings.length - startSequence + 1));
        }
        System.out.println("Первоначальный массив строк: " + Arrays.toString(stringsAndSpaces));
        System.out.println("Измененный массив строк: " + Arrays.toString(strings));
    }

    private static void printElementsOfArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

