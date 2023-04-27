package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    static boolean isContinue = true;
    static String enter = "" +
            "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Шкаф пуст. Вы можете добавить в него первую книгу");
        do {
            menu();
            selectOperation(scanner.nextLine());
            if (isContinue) {
                System.out.println("Для продолжения операций нажмите Enter");
                while (!enter.equals(scanner.nextLine())) {
                    System.out.println("Введите Enter для продолжения");
                }
            }
        } while (isContinue);
    }

    private static void menu() {
        String menu = """
                1. Добавить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Показать все книги
                5. Количество книг в шкафу
                6. Количество свободных полок
                7. Очистить полку
                8. Завершить работу
                """;
        System.out.print("\n" + menu);
        System.out.println("Введите нужную операцию:");
    }

    private static void selectOperation(String operation) {
        Scanner scanner = new Scanner(System.in);
        switch (operation) {
            case "1", "Добавить книгу" -> {
                System.out.println("Введите книгу в формате: Автор, название, год выпуска");
                String input = scanner.nextLine();
                try {
                    String[] result= input.split(", ");
                    Bookshelf.addBook(new Book(result[0], result[1], Integer.parseInt(result[2])));
                } catch (RuntimeException e) {
                    System.out.println("Введите книгу в допустимом формате");
                }
                Bookshelf.getBooks();
            }
            case "2", "Найти книгу" -> {
                System.out.println("Ввведите название книги: ");
                Bookshelf.findBook(scanner.nextLine());
                Bookshelf.getBooks();
            }
            case "3", "Удалить книгу" -> {
                System.out.println("Введите название книги, которую ходите удалить");
                Bookshelf.deleteBook(scanner.nextLine());
                Bookshelf.getBooks();
            }
            case "4", "Показать все книги" -> Bookshelf.getBooks();
            case "5", "Количество книг в шкафу" -> {
                System.out.println("Количество книг в шкафу: " + Bookshelf.numOfBooks);
                Bookshelf.getBooks();
            }
            case "6", "Количество свободных полок" -> {
                System.out.println("Количество свободных полок в шкафу: " + Bookshelf.getEmptyShelfs());
                Bookshelf.getBooks();
            }
            case "7", "Очистить полку" -> Bookshelf.clearShelf();
            case "8", "Завершить работу" -> isContinue = false;
            default -> System.out.println("Введите поддерживаемый пункт меню");
        }
    }
}