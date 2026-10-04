package labsheet1;

import java.util.Scanner;

class PrimeChecker {
    int number;

    boolean isPrime() {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    void displayResult() {
        if (isPrime()) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrimeChecker obj = new PrimeChecker();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.displayResult();

        sc.close();
    }
}
