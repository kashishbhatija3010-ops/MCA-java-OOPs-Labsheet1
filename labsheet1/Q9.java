package labsheet1;

import java.util.Scanner;

class Result {
    double marks1;
    double marks2;
    double marks3;

    double calculateTotal() {
        return marks1 + marks2 + marks3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3;
    }

    void displayResult() {
        double total = calculateTotal();
        double percentage = calculatePercentage();

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (marks1 >= 40 && marks2 >= 40 && marks3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Result result = new Result();

        System.out.print("Enter marks of subject 1: ");
        result.marks1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        result.marks2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        result.marks3 = sc.nextDouble();

        result.displayResult();

        sc.close();
    }
}
