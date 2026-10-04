package labsheet1;

import java.util.Scanner;

class MarriageEligibility {
    int age;
    char gender;

    void checkEligibility() {
        if (gender == 'M' || gender == 'm') {
            if (age >= 21) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage");
            }
        } else if (gender == 'F' || gender == 'f') {
            if (age >= 18) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage");
            }
        } else {
            System.out.println("Invalid gender");
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MarriageEligibility obj = new MarriageEligibility();

        System.out.print("Enter age: ");
        obj.age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        obj.gender = sc.next().charAt(0);

        obj.checkEligibility();

        sc.close();
    }
}
