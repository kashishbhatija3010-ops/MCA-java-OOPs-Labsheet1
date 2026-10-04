package labsheet1;

import java.util.Scanner;

class YearChecker {
    int year;

    void checkLeapYear() {
        if ((year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0)) {

            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        YearChecker obj = new YearChecker();

        System.out.print("Enter year: ");
        obj.year = sc.nextInt();

        obj.checkLeapYear();

        sc.close();
    }
}
