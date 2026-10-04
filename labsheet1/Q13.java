package labsheet1;

import java.util.Scanner;

class NumberSign {
    int number;

    void checkSign() {
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NumberSign obj = new NumberSign();

        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();

        obj.checkSign();

        sc.close();
    }
}
