package labsheet1;

import java.util.Scanner;

class PalindromeChecker {
    int number;

    boolean isPalindrome() {
        int original = number;
        int temp = number;
        int reverse = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        return original == reverse;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeChecker obj = new PalindromeChecker();

        System.out.print("Enter an integer: ");
        obj.number = sc.nextInt();

        obj.displayResult();

        sc.close();
    }
}
