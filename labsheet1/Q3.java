package labsheet1;

import java.util.Scanner;

class NumberChecker {
    int number;

    void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberChecker checker = new NumberChecker();

        System.out.print("Enter a number: ");
        checker.number = sc.nextInt();

        checker.checkEvenOdd();

        sc.close();
    }
}