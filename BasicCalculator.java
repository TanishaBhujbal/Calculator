import java.util.Scanner;

// Creating a class BasicCalculator
public class BasicCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variable to control the loop for repeating the calculation process
        char continueCalculation = 0;

        // Start a loop to allow the user to repeat calculations
        do {
            // Taking the user input (first Number)
            System.out.println("Enter first number:");
            // Reading the first number from user
            double num1 = scanner.nextDouble();

            // Taking the user input (second number)
            System.out.println("Enter second number:");
            // Reading the second number from the user
            double num2 = scanner.nextDouble();

            // Selecting the operators from user
            System.out.println("Select operation (+, -, *, /):");
            // Read the operator character from user
            char operator = scanner.next().charAt(0);

            double result;

            // Use a switch statement to determine the operation to perform
            switch (operator) {
                case '+':
                    // Performing Addition
                    result = num1 + num2;
                    break;
                case '-':
                    // Performing Subtraction
                    result = num1 - num2;
                    break;
                case '*':
                    // Performing Multiplication
                    result = num1 * num2;
                    break;
                case '/':
                    // Check for division by zero
                    if (num2 != 0) {
                        // Performing Division
                        result = num1 / num2;
                    } else {
                        // Displaying error message for division by zero
                        System.out.println("Error: Division by zero");
                        continue; // Skip to next iteration
                    }
                    break;
                default:
                    // Displaying error message for invalid operator
                    System.out.println("Invalid operator");
                    continue; // Skips to next iteration
            }

            // Displaying the Calculated Result
            System.out.println("Result: " + result);

            // Asking the user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y'); // Repeats if user enters 'y'

        // Thanking the user and close the program
        System.out.println("Thank you for using the Basic Calculator!");

        // Closing the scanner to release the process
        scanner.close();
    }
}
