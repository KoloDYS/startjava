import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean isContinue = true;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало математических вычислений");
        do {
            boolean isNext;
            System.out.print("\nВведите первое число: ");
            calculator.setA(scanner.nextInt());
            System.out.print("\nВведите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            while (!(calculator.getSign() == '+' || calculator.getSign() == '-' ||
                        calculator.getSign() == '%' || calculator.getSign() == '*' ||
                        calculator.getSign() == '^' || calculator.getSign() == '/')) {
                System.out.println("Введите корректный знак математической операции: ");
                calculator.setSign(scanner.next().charAt(0));
        }
            System.out.print("\nВведите второе число: ");
            calculator.setB(scanner.nextInt());
            System.out.println("Результат вычислений:");
            calculator.calculate(calculator.getA(), calculator.getB(), calculator.getSign());
            System.out.print("Хотите продолжить вычисления? [yes/no]:\n");
            do {
                String answer = scanner.next();
                if (answer.equals("no")) {
                    isContinue = false;
                    isNext = false;
                } else if (answer.equals("yes")) {
                    isNext = false;
                } else {
                    System.out.print("Вы ввели недопустимый ответ, введите корректный ответ: ");
                    isNext = true;
                };
            } while (isNext);
        } while (isContinue);
        scanner.close();
    }
}