import java.util.Scanner;

public class testInput {
    public static void main(String[] args) throws Exception {
        // Create a Scanner object to read user's input.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input.
        System.out.print("Enter your name? ");

        // Read the user's input as a string.
        String userInput = scanner.nextLine();

        // Display the user's input.
        System.out.println("You entered: " + userInput);

        // Close the scanner.
        scanner.close();
    }
}
