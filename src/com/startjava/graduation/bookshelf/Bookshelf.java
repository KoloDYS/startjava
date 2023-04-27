package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int MAX_NUM_BOOKS = 10;
    private static final Book[] books = new Book[MAX_NUM_BOOKS];
    private  static int index = 0;
    private static int lengthOfShelf = 0;
    static int numOfBooks;

    public static void addBook(Book b){
        if (index > 9) {
            System.out.println("На полке закончилось место. Книга не может быть добавлена");
            return;
        }
        if (lengthOfShelf < b.getLength()) {
          lengthOfShelf = b.getLength();
        }
        books[index++] = b;
        numOfBooks++;
    }

    public static void findBook(String s) {
        for (int i = 0; i <= index; i++) {
            if (books[i].getName().equals(s)) {
                System.out.println("Книга " + s + " находится на " + (i + 1) + " полке");
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public static void deleteBook(String s) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getName().equals(s)) {
                calculateLengthOfShelf(books[i]);
                System.arraycopy(books, i + 1, books, i, (--numOfBooks) - i);
                index--;
                System.out.println("Книга была удалена");
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public static void getBooks() {
        System.out.println("Актуальное состояние шкафа: ");
        infoAboutShelfs();
        for (int i = 0; i < numOfBooks; i++) {
            System.out.println("|" + books[i] + " ".repeat(lengthOfShelf - books[i].getLength()) + "|");
            System.out.println("|" + "-".repeat(lengthOfShelf) + "|");
        }
        if(numOfBooks != 0 && getEmptyShelfs() != 0) {
            System.out.println("|" + " ".repeat(lengthOfShelf) + "|");
        } else if (numOfBooks == 0){
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }

    public static int getEmptyShelfs() {
        return (MAX_NUM_BOOKS - numOfBooks);
    }

    public static void clearShelf() {
        Arrays.fill(books, 0, index, null);
        numOfBooks = 0;
        index = 0;
        System.out.println("Полка очищена");
    }

    private static void infoAboutShelfs() {
        System.out.println("В шкафу " + numOfBooks + " книг и свободно " + getEmptyShelfs() + " полок");
    }
    private static void calculateLengthOfShelf(Book b) {
        if (b.getLength() == lengthOfShelf) {
            lengthOfShelf = 0;
            for (int i = 0; i < numOfBooks; i++) {
                if (!b.equals(books[i])) {
                    lengthOfShelf = Math.max(lengthOfShelf, books[i].getLength());
                }
            }
        }
    }
}