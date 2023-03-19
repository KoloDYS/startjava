import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String answer;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало математических вычислений");
        do {
            System.out.print("\nВведите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("\nВведите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("\nВведите второе число: ");
            calculator.setB(scanner.nextInt());
            System.out.println("Результат вычислений:");
            calculator.calculate();
            System.out.print("Хотите продолжить вычисления? [yes/no]:\n");
            answer = scanner.next();
            while (!answer.equals("yes") && !answer.equals("no")) {
                System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
                answer = scanner.nextLine();
            }
        } while (answer.equals("yes"));
        scanner.close();
    }
}