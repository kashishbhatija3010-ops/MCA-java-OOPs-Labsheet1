package labsheet1;

import java.util.Scanner;

class TypeCasting {
    double number;

    void convert() {
        int convertedNumber = (int) number;

        System.out.println("Original value: " + number);
        System.out.println("Converted value: " + convertedNumber);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TypeCasting obj = new TypeCasting();

        System.out.print("Enter a floating-point number: ");
        obj.number = sc.nextDouble();

        obj.convert();

        sc.close();
    }
}
