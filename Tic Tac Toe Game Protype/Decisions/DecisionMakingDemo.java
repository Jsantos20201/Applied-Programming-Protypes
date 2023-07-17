import java.util.Scanner;

public class DecisionMakingDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Decision-making using if-else statements
        if (age < 0) {
            System.out.println("Invalid age! Age cannot be negative.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // Close the scanner
        scanner.close();
    }
}
