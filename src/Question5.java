import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            // Perform division
            int result = 100 / number;
            System.out.println("100 divided by " + number + " is: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Division by zero is not allowed.");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");

        } finally {
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}
