import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;
    private int result;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char signOfOperation) {
        sign = signOfOperation;
    }


    public void calculate() {
        while (true) {
            switch (sign) {
                case '+':
                    result = a + b;
                    System.out.println(a + " " + sign + " " + b + " = " + result);
                    return;
                case '-':
                    result = a - b;
                    System.out.println(a + " " + sign + " " + b + " = " + result);
                    return;
                case '*':
                    result = a * b;
                    System.out.println(a + " " + sign + " " + b + " = " + result);
                    return;
                case '/':
                    result = a / b;
                    System.out.println(a + " " + sign + " " + b + " = " + result);
                    return;
                case '%':
                    result = a % b;
                    System.out.println(a + " " + sign + " " + b + " = " + result);
                    return;
                case '^':
                    result = a;
                    for (int i = 1; i < b; i++) {
                        result *= a;
                    }
                    System.out.println(a + " " + sign + " " + b + " = " + result);
                    return;
                default:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Введите корректный знак математической операции: ");
                    sign = scan.next().charAt(0);
                    break;
            }
        }
    }
}