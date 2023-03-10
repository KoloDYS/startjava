public class Calculator {
    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int a = 7;
        int b = 5;
        int result = 0;
        char sign = '+';

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '%') {
            result = a % b;
        } else {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}