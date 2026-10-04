package labsheet1;

import java.util.Scanner;

class IncomeTax {
    double income;

    double calculateTax() {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return income * 0.05;
        } else if (income <= 1000000) {
            return income * 0.20;
        } else {
            return income * 0.30;
        }
    }

    void displayTax() {
        double tax = calculateTax();

        System.out.println("Income: Rs. " + income);
        System.out.println("Tax: Rs. " + tax);
    }
}

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IncomeTax obj = new IncomeTax();

        System.out.print("Enter annual income: ");
        obj.income = sc.nextDouble();

        obj.displayTax();

        sc.close();
    }
}