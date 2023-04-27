package com.startjava.graduation.bookshelf;

public class Book {
    private final String author;
    private final String name;
    private final int year;
    private final int length;

    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.length = author.length() + name.length() + 8;
    }

    public int getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return author + ", " + name + ", " + year;
    }
}