package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1.Реверс значений массива");
        int[] nums = {4, 2, 5, 7, 1, 3, 6};
        System.out.print("Массив до модификации: ");
        printElementsOfArray(nums);
        int len = nums.length;
        for (int i = 0; i < len / 2 + 1; i++) {
            int temp = nums[i];
            nums[i] = nums[--len];
            nums[len] = temp;
        }
        System.out.print("\nМассив после модификации: ");
        printElementsOfArray(nums);

        System.out.println("\n\n2.Вывод произведения элементов массива");
        int[] arrayOfDigits = new int[10];
        len = arrayOfDigits.length;
        for (int i = 0; i < len; i++) {
            arrayOfDigits[i] = i;
        }
        int product = 1;
        for (int i = 1; i < len - 1; i++) {
            product *= i;
            System.out.print((arrayOfDigits[i] == len - 2) ? arrayOfDigits[i] + " = " + product :
                    arrayOfDigits[i] + " * ");
        }
        System.out.println("\nЦифры 0 и 9 находятся в массиве под индексами : " +
                arrayOfDigits[0] + " и " + arrayOfDigits[9]);

        System.out.println("\n3.Удаление элементов массива");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Массив до обнуления");
        printDoubleArray(doubleArr);
        double comparisonNum = doubleArr[len / 2];
        int counter = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > comparisonNum) {
                doubleArr[i] = 0;
                counter++;
            }
        }
        System.out.println("\nМассив после обнуления");
        printDoubleArray(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек = " + counter);

        System.out.println("\n4.Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) ('A' + i);
        }
        String alphabet = "";
        len = letters.length;
        for (int i = len - 1; i >= 0; i--) {
            alphabet += letters[i];
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
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = srcStrings.length;
        int countNonBlankStrings = 0;
        for (String s : srcStrings) {
            if (!s.isBlank()) {
                countNonBlankStrings++;
            }
        }
        String[] destStrings = new String[countNonBlankStrings];
        int startSequence = -1;
        int endSequence;
        int desPos = 0;
        for (int i = 0; i < len; i++) {
            if (!srcStrings[i].isBlank()) {
                if (startSequence == -1) {
                    startSequence = i;
                }
            } else if (srcStrings[i].isBlank() && startSequence != -1) {
                endSequence = i;
                System.arraycopy(srcStrings, startSequence, destStrings, desPos, endSequence - startSequence);
                desPos += (endSequence - startSequence);
                startSequence = endSequence + 1;
            }
        }
        System.out.println("Первоначальный массив строк: " + Arrays.toString(srcStrings));
        System.out.println("Измененный массив строк: " + Arrays.toString(destStrings));
    }

    private static void printElementsOfArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void printDoubleArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length / 2 + 1) {
                System.out.println();
            }
            System.out.printf("%.3f  ", array[i]);
        }
    }
}

