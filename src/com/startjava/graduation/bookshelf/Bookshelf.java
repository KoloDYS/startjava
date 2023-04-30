package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private final Book[] books = new Book[CAPACITY];
    private int index;
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
        if (index == CAPACITY) {
            System.out.println("На полке закончилось место. Книга не может быть добавлена");
            return;
        }
        if (lengthShelf < book.getLength()) {
            lengthShelf = book.getLength();
        }
        books[index++] = book;
        numBooks++;
    }

    public void find(String title) {
        for (int i = 0; i <= index; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println("Книга " + title + " находится на " + (i + 1) + " полке");
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public void delete(String title) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                calculatelengthShelf(books[i]);
                System.arraycopy(books, i + 1, books, i, (--numBooks) - i);
                index--;
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
        Arrays.fill(books, 0, index, null);
        numBooks = 0;
        index = 0;
        System.out.println("Полка очищена");
    }

    public void infoAboutShelfs() {
        System.out.println("В шкафу " + numBooks + " книг и свободно " + getEmptyShelfs() + " полок");
    }

    private void calculatelengthShelf(Book book) {
        if (book.toString().length() == lengthShelf) {
            lengthShelf = 0;
            for (int i = 0; i < numBooks; i++) {
                if (!book.equals(books[i])) {
                    lengthShelf = Math.max(lengthShelf, books[i].getLength());
                }
            }
        }
    }
}