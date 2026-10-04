# MCA-java-OOPs-Labsheet1
Labsheet-01
# 1
package labsheet1;

class Student {
    String name;
    int age;
    String college;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Kashish Bhatija";
        student.age = 22;
        student.college = "COER University";
        student.displayDetails();
    }
}
# 2
package labsheet1;

import java.util.Scanner;

class Calculator {
    int a;
    int b;
    void calculate() {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Division and modulus by zero are not possible.");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.print("Enter first number: ");
        calculator.a = sc.nextInt();
        System.out.print("Enter second number: ");
        calculator.b = sc.nextInt();
        calculator.calculate();
        sc.close();
    }
}
# 3
package labsheet1;

import java.util.Scanner;

class NumberChecker {
    int number;
    void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();
        System.out.print("Enter a number: ");
        checker.number = sc.nextInt();
        checker.checkEvenOdd();
        sc.close();
    }
}
# 4
package labsheet1;

import java.util.Scanner;

class RelationalOperations {
    int a;
    int b;
    void compare() {
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RelationalOperations obj = new RelationalOperations();
        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();
        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();
        obj.compare();
        sc.close();
    }
}
# 5
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
# 6
package labsheet1;

import java.util.Scanner;

class CharacterInfo {
    char character;
    void displayASCII() {
        int ascii = (int) character;
        System.out.println("ASCII value: " + ascii);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterInfo obj = new CharacterInfo();
        System.out.print("Enter a character: ");
        obj.character = sc.next().charAt(0);
        obj.displayASCII();
        sc.close();
    }
}

# 7
package labsheet1;

import java.util.Scanner;

class DivisibilityChecker {
    int number;
    void check() {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Number is divisible by both 3 and 5.");
        } else {
            System.out.println("Number is not divisible by both 3 and 5.");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DivisibilityChecker obj = new DivisibilityChecker();
        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();
        obj.check();
        sc.close();
    }
}

# 8
package labsheet1;

import java.util.Scanner;

class VowelChecker {
    char character;
    void check() {
        if (character == 'a' || character == 'e' ||
            character == 'i' || character == 'o' ||
            character == 'u' || character == 'A' ||
            character == 'E' || character == 'I' ||
            character == 'O' || character == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelChecker obj = new VowelChecker();
        System.out.print("Enter a character: ");
        obj.character = sc.next().charAt(0);
        obj.check();
        sc.close();
    }
}
# 9
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

# 10
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

# 11
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

# 12
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

# 13
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

# 14
package labsheet1;

import java.util.Scanner;

class CharacterClassifier {
    char character;
    void classify() {
        if (character >= '0' && character <= '9') {
            System.out.println("Digit");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("Uppercase letter");
        } else if (character >= 'a' && character <= 'z') {
            System.out.println("Lowercase letter");
        } else {
            System.out.println("Special character");
        }
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharacterClassifier obj = new CharacterClassifier();
        System.out.print("Enter a character: ");
        obj.character = sc.next().charAt(0);
        obj.classify();
        sc.close();
    }
}
# 15
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

# 16
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
# 17 
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

# 18
package labsheet1;

import java.util.Scanner;

class PrimeChecker {
    int number;
    boolean isPrime() {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    void displayResult() {
        if (isPrime()) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeChecker obj = new PrimeChecker();
        System.out.print("Enter a number: ");
        obj.number = sc.nextInt();
        obj.displayResult();
        sc.close();
    }
}

# 19
package labsheet1;

import java.util.Scanner;

class OperatorCalculator {
    double a;
    double b;
    char operator;
    void calculate() {
        if (operator == '+') {
            System.out.println("Result: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Result: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Result: " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator");
        }
    }
}

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperatorCalculator calculator = new OperatorCalculator();
        System.out.print("Enter first number: ");
        calculator.a = sc.nextDouble();
        System.out.print("Enter second number: ");
        calculator.b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        calculator.operator = sc.next().charAt(0);
        calculator.calculate();
        sc.close();
    }
}

# 20
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

