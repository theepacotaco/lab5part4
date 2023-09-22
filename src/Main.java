import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Please enter your age: ");

        // Read the user's age as an integer
        int age = scanner.nextInt();

        // Check if the user is 21 or older
        if (age >= 21) {
            System.out.println("You get a wristband!");
        }

        // Close the scanner
        scanner.close();
    }
}