package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static boolean isContinue = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        final String enter = "";
        do {
            showBookshelf(bookshelf);
            printMenu();
            selectOperation(scanner, bookshelf);
            if (isContinue) {
                System.out.println("Для продолжения операций нажмите Enter");
                while (!enter.equals(scanner.nextLine())) {
                    System.out.println("Введите Enter для продолжения");
                }
            }
        } while (isContinue);
    }

    private static void printMenu() {
        System.out.println("""
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить полку
                5. Завершить работу
                Введите нужную операцию:""");
    }

    private static void selectOperation(Scanner scanner, Bookshelf bookshelf) {
        switch (scanner.nextLine()) {
            case "1", "Добавить книгу" -> {
                System.out.println("Введите книгу в формате: Автор, название, год выпуска");
                String input = scanner.nextLine();
                try {
                    String[] book = input.split(", ");
                    bookshelf.add(new Book(book[0], book[1], Integer.parseInt(book[2])));
                } catch (RuntimeException e) {
                    System.out.println("Введите книгу в допустимом формате");
                }
            }
            case "2", "Найти книгу" -> {
                System.out.println("Введите название книги: ");
                bookshelf.find(scanner.nextLine());
            }
            case "3", "Удалить книгу" -> {
                System.out.println("Введите название книги, которую ходите удалить");
                bookshelf.delete(scanner.nextLine());
            }
            case "4", "Очистить полку" -> bookshelf.clearShelf();
            case "5", "Завершить работу" -> isContinue = false;
            default -> System.out.println("Введите поддерживаемый пункт меню");
        }
    }

    private static void showBookshelf(Bookshelf bookshelf) {
        bookshelf.infoAboutShelfs();
        int length = bookshelf.getLengthShelf();
        int booksInShelf = bookshelf.getNumBooks();
        for (int i = 0; i < booksInShelf; i++) {
            System.out.println("|" + bookshelf.getBooks()[i] + " ".repeat(
                    length - bookshelf.getBooks()[i].getLength()) + "|");
            System.out.println("|" + "-".repeat(length) + "|");
        }
        if (booksInShelf != 0 && bookshelf.getEmptyShelfs() != 0) {
            System.out.println("|" + " ".repeat(length) + "|");
        } else if (booksInShelf == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }
}