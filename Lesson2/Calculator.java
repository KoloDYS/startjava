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
        while (true) {
            switch(signOfOperation) {
                case '+', '-', '%', '*', '^', '/':
                    sign = signOfOperation;
                    return;
                default:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Введите корректный знак математической операции: ");
                    signOfOperation = scan.nextLine().charAt(0);
                    break;
            }
        }
    }

    public void calculate() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            case '^':
                result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}