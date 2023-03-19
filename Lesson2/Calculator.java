import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;
    private int result;
    private char sign;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char signOfOperation) {
        sign = signOfOperation;
        while (!(sign == '+' || sign == '-' || sign == '%' || sign == '*' ||
                sign == '^' || sign == '/')) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Введите корректный знак математической операции: ");
                    sign = scan.nextLine().charAt(0);
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