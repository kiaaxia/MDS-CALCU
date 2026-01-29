package division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Division Calculator ===");

        // Get first number
        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();

        // Get second number
        System.out.print("Enter the second number: ");
        double num2 = scan.nextDouble();

        // Check for division by zero
        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + result);
        }

        scan.close();
    }
}

