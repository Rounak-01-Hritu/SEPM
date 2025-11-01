import java.util.Scanner;

class Calculator {

    // Method for addition
    public double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        double num1, num2, result;
        char operator;

        System.out.println("===== Simple Calculator =====");

        while (true) {
            System.out.print("\nEnter first number: ");
            num1 = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = sc.nextDouble();

            switch (operator) {
                case '+':
                    result = calc.add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = calc.subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = calc.multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = calc.divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }
        }

        sc.close();
    }
}
