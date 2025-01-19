import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;

        do {
            // Simple Interest Calculator
            System.out.println("Simple Interest Calculator");

            System.out.print("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter the rate of interest (in %): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter the time (in years): ");
            double time = scanner.nextDouble();

            // Calculate simple interest
            double simpleInterest = (principal * rate * time) / 100;

            // Display the result
            System.out.println("The Simple Interest is: " + simpleInterest);

            // Ask the user if they want to perform another calculation
            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        System.out.println("Thank you for using the Simple Interest Calculator!");
        scanner.close();
    }
}
