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
