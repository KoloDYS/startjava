package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private final Book[] books = new Book[CAPACITY];
    private int lengthShelf;
    private int numBooks;

    public Book[] getBooks() {
        return books;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public int getLengthShelf() {
        return lengthShelf;
    }

    public void add(Book book) {
        if (numBooks >= CAPACITY) {
            System.out.println("На полке закончилось место. Книга не может быть добавлена");
            return;
        }
        lengthShelf = Math.max(lengthShelf, book.getLength());
        book.setNumShelf(numBooks + 1);
        books[numBooks++] = book;
    }

    public Book find(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                calculateLengthShelf(books[i]);
                System.arraycopy(books, i + 1, books, i, --numBooks - i);
                System.out.println("Книга была удалена");
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public int getEmptyShelfs() {
        return (CAPACITY - numBooks);
    }

    public void clearShelf() {
        Arrays.fill(books, 0, numBooks, null);
        numBooks = 0;
        System.out.println("Полка очищена");
    }

    private void calculateLengthShelf(Book book) {
        if (book.getLength() == lengthShelf) {
            lengthShelf = 0;
            for (int i = 0; i < numBooks; i++) {
                if (!(book.getLength() == books[i].getLength())) {
                    lengthShelf = Math.max(lengthShelf, books[i].getLength());
                }
            }
        }
    }
}