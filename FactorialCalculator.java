import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;

        // Start a do-while loop to allow the user to perform multiple calculations
        do {
            // Ask the user to enter a non-negative integer
            System.out.print("Enter a non-negative integer: ");
            int number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                // Calculate the factorial
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i; // Multiply factorial by i
                }
                // Display the factorial
                System.out.println("The factorial of " + number + " is: " + factorial);
            }

            // Ask the user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y'); // Repeat if user enters 'y' or 'Y'

        // Thank the user and close the scanner
        System.out.println("Thank you for using the Factorial Calculator!");
        scanner.close();
    }
}
