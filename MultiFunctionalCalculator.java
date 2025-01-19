import java.util.Scanner;

public class MultiFunctionalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;

        // Main menu for selecting calculator type
        do {
            System.out.println("Welcome to the Multi-Function Calculator");
            System.out.println("Select an option:");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Advanced Calculator");
            System.out.println("3. Factorial Calculator");
            System.out.println("4. Simple Interest Calculator");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    basicCalculator(scanner);
                    break;
                case 2:
                    advancedCalculator(scanner);
                    break;
                case 3:
                    factorialCalculator(scanner);
                    break;
                case 4:
                    simpleInterestCalculator(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);
        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        System.out.println("Thank you for using the Multi-Function Calculator!");
        scanner.close();
    }

    // Basic calculator function
    private static void basicCalculator(Scanner scanner) {
        System.out.println("\nBasic Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Select operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }

    // Advanced calculator function
    private static void advancedCalculator(Scanner scanner) {
        System.out.println("\nAdvanced Calculator");
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exponentiation (^)");
        System.out.println("6. Modulus (%)");
        System.out.println("7. Square Root (√)");
        System.out.println("8. Exponential Function (e^x)");
        System.out.println("9. Logarithm (log)");
        System.out.println("10. Trigonometric Functions (sin, cos, tan)");
        System.out.print("Enter your choice of operators (1-10): ");
        int choice = scanner.nextInt();

        double num1 = 0, num2 = 0;
        if (choice >= 1 && choice <= 11) {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            if (choice != 8 && choice != 9 && choice != 7) { // Exponential, Logarithm and Square Root only need one number
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            }
        }

        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                result = Math.pow(num1, num2);
                System.out.println("Result: " + num1 + " ^ " + num2 + " = " + result);
                break;
            case 6:
                result = num1 % num2;
                System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
                break;
            case 7:
                result = Math.sqrt(num1); // Square root of the first number
                System.out.println("Result: √" + num1 + " = " + result);
                break;
            case 8:
                result = Math.exp(num1); // Exponential function (e^x)
                System.out.println("Result: e^" + num1 + " = " + result);
                break;
            case 9:
                result = Math.log(num1); // Natural logarithm (log(x))
                System.out.println("Result: log(" + num1 + ") = " + result);
                break;
            case 10:
                System.out.println("Select Trigonometric function:");
                System.out.println("a. Sine (sin)");
                System.out.println("b. Cosine (cos)");
                System.out.println("c. Tangent (tan)");
                char trigChoice = scanner.next().charAt(0);
                switch (trigChoice) {
                    case 'a':
                        result = Math.sin(Math.toRadians(num1)); // sin(x), converting degrees to radians
                        System.out.println("Result: sin(" + num1 + "°) = " + result);
                        break;
                    case 'b':
                        result = Math.cos(Math.toRadians(num1)); // cos(x), converting degrees to radians
                        System.out.println("Result: cos(" + num1 + "°) = " + result);
                        break;
                    case 'c':
                        result = Math.tan(Math.toRadians(num1)); // tan(x), converting degrees to radians
                        System.out.println("Result: tan(" + num1 + "°) = " + result);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
                default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
    }

    // Factorial calculator function
    private static void factorialCalculator(Scanner scanner) {
        System.out.println("\nFactorial Calculator");
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }

    // Simple Interest calculator function
    private static void simpleInterestCalculator(Scanner scanner) {
        System.out.println("\nSimple Interest Calculator");
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is: " + simpleInterest);
    }
}