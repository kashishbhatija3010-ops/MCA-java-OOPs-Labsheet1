package labsheet1;

import java.util.Scanner;

class GreatestOfTwo {
    int a;
    int b;

    void findGreatest() {
        if (a > b) {
            System.out.println("Greatest number: " + a);
        } else if (b > a) {
            System.out.println("Greatest number: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GreatestOfTwo obj = new GreatestOfTwo();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.findGreatest();

        sc.close();
    }
}
