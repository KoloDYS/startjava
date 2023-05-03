package com.startjava.graduation.bookshelf;

public class Book {
    private final String author;
    private final String title;
    private final int year;
    private final int length;
    private int numShelf;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
        length = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public void setNumShelf(int numShelf) {
        this.numShelf = numShelf;
    }

    public int getNumShelf() {
        return numShelf;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + year;
    }
}