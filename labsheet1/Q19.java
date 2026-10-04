package labsheet1;

import java.util.Scanner;

class OperatorCalculator {
    double a;
    double b;
    char operator;

    void calculate() {
        if (operator == '+') {
            System.out.println("Result: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Result: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Result: " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        OperatorCalculator calculator = new OperatorCalculator();

        System.out.print("Enter first number: ");
        calculator.a = sc.nextDouble();

        System.out.print("Enter second number: ");
        calculator.b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        calculator.operator = sc.next().charAt(0);

        calculator.calculate();

        sc.close();
    }
}
