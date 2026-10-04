package labsheet1;

import java.util.Scanner;

class GreatestOfThree {
    int a;
    int b;
    int c;

    void findGreatest() {
        int largest;

        if (a >= b) {
            if (a >= c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b >= c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.println("Largest number: " + largest);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GreatestOfThree obj = new GreatestOfThree();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        System.out.print("Enter third number: ");
        obj.c = sc.nextInt();

        obj.findGreatest();

        sc.close();
    }
}
