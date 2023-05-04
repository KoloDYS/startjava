package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        boolean isContinue;
        do {
            showBookshelf(bookshelf);
            printMenu();
            isContinue = selectOperation(scanner, bookshelf);
            if (isContinue) {
                pressEnter(scanner);
            }
        } while (isContinue);
    }

    private static void showBookshelf(Bookshelf bookshelf) {
        int numBooks = bookshelf.getNumBooks();
        if (numBooks == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
            return;
        }
        if (bookshelf.getNumBooks() > 0) {
            showInfoAboutShelfs(bookshelf);
        }
        Book[] books = bookshelf.getBooks();
        int length = bookshelf.getLengthShelf();
        for (int i = 0; i < numBooks; i++) {
            System.out.println("|" + books[i] +
                    " ".repeat(length - books[i].getLength()) + "|");
            System.out.println("|" + "-".repeat(length) + "|");
        }
        if (bookshelf.getEmptyShelfs() > 0) {
            System.out.println("|" + " ".repeat(length) + "|");
        }
    }

    private static void showInfoAboutShelfs(Bookshelf bookshelf) {
        System.out.println("В шкафу " + bookshelf.getNumBooks() +
                " книг и свободно " + bookshelf.getEmptyShelfs() + " полок");
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

    private static boolean selectOperation(Scanner scanner, Bookshelf bookshelf) {
        switch (scanner.nextLine()) {
            case "1", "Добавить книгу" -> addBook(scanner, bookshelf);
            case "2", "Найти книгу" -> findBook(scanner, bookshelf);
            case "3", "Удалить книгу" -> deleteBook(scanner, bookshelf);
            case "4", "Очистить полку" -> bookshelf.clearShelf();
            case "5", "Завершить работу" -> {
                return false;
            }
            default -> System.out.println("Введите поддерживаемый пункт меню");
        }
        return true;
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

    private static void findBook(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите название книги: ");
        Book book = bookshelf.find(scanner.nextLine());
        System.out.println("Книга " + (book != null ? book + " на " + book.getNumShelf() + " полке" : "не найдена"));
    }

    private static void deleteBook(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите название книги, которую ходите удалить");
        bookshelf.delete(scanner.nextLine());
    }

    private static void pressEnter(Scanner scanner) {
        String enter = " ";
        while (!enter.equals("")) {
            System.out.println("Введите Enter для продолжения");
            enter = scanner.nextLine();
        }
    }
}