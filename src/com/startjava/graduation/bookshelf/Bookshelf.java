package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int MAX_NUM_BOOKS = 10;
    public final Book[] books = new Book[MAX_NUM_BOOKS];
    private static int index = 0;
    int lengthOfShelf = 0;
    int numOfBooks;

    public void addBook(Book book) {
        if (index > 9) {
            System.out.println("На полке закончилось место. Книга не может быть добавлена");
            return;
        }
        int length = book.toString().length();
        if (lengthOfShelf < length) {
          lengthOfShelf = length;
        }
        books[index++] = book;
        numOfBooks++;
    }

    public void findBook(String targetBook) {
        for (int i = 0; i <= index; i++) {
            if (books[i].getTitle().equals(targetBook)) {
                System.out.println("Книга " + targetBook + " находится на " + (i + 1) + " полке");
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public void deleteBook(String targetBook) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equals(targetBook)) {
                calculateLengthOfShelf(books[i]);
                System.arraycopy(books, i + 1, books, i, (--numOfBooks) - i);
                index--;
                System.out.println("Книга была удалена");
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public int getEmptyShelfs() {
        return (MAX_NUM_BOOKS - numOfBooks);
    }

    public void clearShelf() {
        Arrays.fill(books, 0, index, null);
        numOfBooks = 0;
        index = 0;
        System.out.println("Полка очищена");
    }

    public void infoAboutShelfs() {
        System.out.println("В шкафу " + numOfBooks + " книг и свободно " + getEmptyShelfs() + " полок");
    }
    private void calculateLengthOfShelf(Book book) {
        if (book.toString().length() == lengthOfShelf) {
            lengthOfShelf = 0;
            for (int i = 0; i < numOfBooks; i++) {
                if (!book.equals(books[i])) {
                    lengthOfShelf = Math.max(lengthOfShelf, books[i].toString().length());
                }
            }
        }
    }
}