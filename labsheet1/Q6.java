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
