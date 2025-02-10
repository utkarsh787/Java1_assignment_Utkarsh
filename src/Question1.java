import java.util.Scanner;
// Separate VowelChecker class
class VowelChecker {
    public void checkCharacter(char ch) {
        ch = Character.toLowerCase(ch);

        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a Consonant.");
                } else {
                    System.out.println(ch + " is not a valid letter.");
                }
        }
    }
}
// Main class
public class Question1 {
    public static void main(String[] args) {
        // Create an instance of VowelChecker
        Scanner scanner = new Scanner(System.in);
        VowelChecker checker = new VowelChecker();

        System.out.print("Enter a character: ");
        char userInput = scanner.next().charAt(0); // Take a single character input

        // Call method with user input
        checker.checkCharacter(userInput);
    }
}
