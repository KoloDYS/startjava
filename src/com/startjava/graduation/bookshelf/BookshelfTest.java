package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static boolean isContinue = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        do {
            showBookshelf(bookshelf);
            printMenu();
            selectOperation(scanner, bookshelf);
            if (isContinue) {
                printEnter(scanner);
            }
        } while (isContinue);
    }

    private static void showBookshelf(Bookshelf bookshelf) {
        infoAboutShelfs(bookshelf);
        int length = bookshelf.getLengthShelf();
        int numBooks = bookshelf.getNumBooks();
        if (numBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        for (int i = 0; i < numBooks; i++) {
            System.out.println("|" + bookshelf.getBooks()[i] +
                    " ".repeat(length - bookshelf.getBooks()[i].getLength()) + "|");
            System.out.println("|" + "-".repeat(length) + "|");
        }
        if (bookshelf.getEmptyShelfs() != 0) {
            System.out.println("|" + " ".repeat(length) + "|");
        }
    }

    private static void infoAboutShelfs(Bookshelf bookshelf) {
        System.out.println("В шкафу " + bookshelf.getNumBooks() + " книг и свободно " +
                bookshelf.getEmptyShelfs() + " полок");
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
            case "1", "Добавить книгу" -> addBook(scanner, bookshelf);
            case "2", "Найти книгу" -> {
                System.out.println("Введите название книги: ");
                int numShelf = bookshelf.find(scanner.nextLine());
                System.out.println("Книга " + (numShelf != 0 ? "на " + numShelf + " полке" : "не найдена"));
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

    private static void addBook(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите книгу в формате: Автор, название, год выпуска");
        String input = scanner.nextLine();
        try {
            String[] details = input.split(", ");
            bookshelf.add(new Book(details[0], details[1], Integer.parseInt(details[2])));
        } catch (RuntimeException e) {
            System.out.println("Введите книгу в допустимом формате");
        }
    }

    private static void printEnter(Scanner scanner) {
        final String enter = "";
        System.out.println("Для продолжения операций нажмите Enter");
        while (!enter.equals(scanner.nextLine())) {
            System.out.println("Введите Enter для продолжения");
        }
    }
}