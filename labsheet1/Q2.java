package labsheet1;

import java.util.Scanner;

class Calculator {
    int a;
    int b;

    void calculate() {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division and modulus by zero are not possible.");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.print("Enter first number: ");
        calculator.a = sc.nextInt();

        System.out.print("Enter second number: ");
        calculator.b = sc.nextInt();

        calculator.calculate();

        sc.close();
    }
}

