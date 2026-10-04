package labsheet1;

import java.util.Scanner;

class ArmstrongChecker {
    int number;

    void checkArmstrong() {
        int original = number;
        int temp = number;
        int sum = 0;

        if (number < 100 || number > 999) {
            System.out.println("Please enter a 3-digit number.");
            return;
        }

        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArmstrongChecker obj = new ArmstrongChecker();

        System.out.print("Enter a 3-digit number: ");
        obj.number = sc.nextInt();

        obj.checkArmstrong();

        sc.close();
    }
}
