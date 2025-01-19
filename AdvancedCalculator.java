import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;

        do {
            System.out.println("Advanced Calculator");
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

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            double num2 = 0;

            if (choice >= 1 && choice <= 6) {
                if (choice != 5) { // Exponentiation only requires one number
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
                            System.out.println("Invalid choice for trigonometric function.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);

        } while (continueCalculation == 'y' || continueCalculation == 'Y');

        System.out.println("Thank you for using the Advanced Calculator!");
        scanner.close();
    }
}
