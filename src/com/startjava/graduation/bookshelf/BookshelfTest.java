package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static boolean isContinue = true;
    static final String enter = "" +
            "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        do {
            getMenu(scanner, bookshelf);
            if (isContinue) {
                System.out.println("Для продолжения операций нажмите Enter");
                while (!enter.equals(scanner.nextLine())) {
                    System.out.println("Введите Enter для продолжения");
                }
            }
        } while (isContinue);
    }

    private static void getMenu(Scanner scanner, Bookshelf bookshelf) {
        getBookshelf(bookshelf);
        String menu = """
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Количество книг в шкафу
                5. Количество свободных полок
                6. Очистить полку
                7. Завершить работу
                """;
        System.out.print(menu);
        System.out.println("Введите нужную операцию:");
        selectOperation(scanner, bookshelf);
    }

    private static void selectOperation(Scanner scanner, Bookshelf bookshelf) {
        switch (scanner.nextLine()) {
            case "1", "Добавить книгу" -> {
                System.out.println("Введите книгу в формате: Автор, название, год выпуска");
                String input = scanner.nextLine();
                try {
                    String[] book = input.split(", ");
                    bookshelf.addBook(new Book(book[0], book[1], Integer.parseInt(book[2])));
                } catch (RuntimeException e) {
                    System.out.println("Введите книгу в допустимом формате");
                }
            }
            case "2", "Найти книгу" -> {
                System.out.println("Введите название книги: ");
                bookshelf.findBook(scanner.nextLine());
            }
            case "3", "Удалить книгу" -> {
                System.out.println("Введите название книги, которую ходите удалить");
                bookshelf.deleteBook(scanner.nextLine());
            }
            case "4", "Количество книг в шкафу" ->
                    System.out.println("Количество книг в шкафу: " + bookshelf.numOfBooks);
            case "5", "Количество свободных полок" ->
                System.out.println("Количество свободных полок в шкафу: " + bookshelf.getEmptyShelfs());
            case "6", "Очистить полку" -> bookshelf.clearShelf();
            case "7", "Завершить работу" -> {
                isContinue = false;
                return;
            }
            default -> System.out.println("Введите поддерживаемый пункт меню");
        }
        getBookshelf(bookshelf);
    }

    private static void getBookshelf(Bookshelf bookshelf) {
        bookshelf.infoAboutShelfs();
        int length = bookshelf.lengthOfShelf;
        for (int i = 0; i < bookshelf.numOfBooks; i++) {
            System.out.println("|" + bookshelf.books[i] + " ".repeat(
                    length - bookshelf.books[i].toString().length()) + "|");
            System.out.println("|" + "-".repeat(length) + "|");
        }
        if(bookshelf.numOfBooks != 0 && bookshelf.getEmptyShelfs() != 0) {
            System.out.println("|" + " ".repeat(length) + "|");
        } else if (bookshelf.numOfBooks == 0){
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        }
    }
}