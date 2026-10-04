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
